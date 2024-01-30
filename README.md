# Java logical expressions

## Description

In this exercises, we will focus on the usage of simple logical expressions.

## Tasks

### Login Query

Validate the input credentials of a user. 

You should print the message:`Welcome, {username}!` if the credentials are valid and the message `Credentials are invalid` if they are not.

Since we have not learned about Collections and other data-structures yet, we'll simply use two constants for the username and password. Use following code:

````java
public static final String ADMIN_USER = "admin";
public static final String ADMIN_PWD = "admin";
````

**Your result should look like this:**

```
What is your username? admin
Type the password for username admin: admin
Welcome, admin!
```
```
What is your username? Luke
Type the password for username Luke: Skywalker
Credentials are invalid
```
```
What is your username? Luke
Type the password for username Luke: admin
Credentials are invalid
```
```
What is your username? admin
Type the password for username admin: password
Credentials are invalid
```

---

### Task 2

Define a function named `isWeekend` that accepts a parameter named `date` of type `LocalDate`. Overload the method to make it available without passing a parameter (use `LocalDate.now()` in this case).

This function will serve as a logical expression and will return `true` if the day of the week in the `date` is either Saturday or Sunday. It will return `false` in any other case.

> You can actually do this in many ways, but in this exercise **you are required to use the OR operator**.

Use the following test cases:

```java
System.out.println(
    solution.isWeekend(LocalDate.of(2021, 8, 6))
);

System.out.println(
    solution.isWeekend(LocalDate.of(2021, 8, 7))
);

System.out.println(
    solution.isWeekend(LocalDate.of(2021, 8, 8))
);

System.out.println(
    solution.isWeekend(LocalDate.of(2021, 8, 9))
);
```

**Your result should look like this:**

```
false
true
true
false
```

---

### Task 3

We now want a version of the first task, that will implement an "open doors" policy on the weekends. So, if the user credentials are valid, or the date is on the weekend, the conditional should evaluate to `True` and greet the user.

- Use a single logical expression.
- Reuse the `isWeekend(<Datetime>)` function from before.

Use the following date objects to do the different tests:

```
today = LocalDate.of(2021, 8, 7)
today = LocalDate.of(2021, 8, 6)
```

**Your result should look like this:**

- On the weekend

    ```java
    today = LocalDate.of(2021, 8, 7)
    ```

    ```
    What is your username? admin
    Type the password for username admin: admin
    Welcome, admin!
    ```
    ```
    What is your username? Anonymous
    Type the password for username admin: 1234
    Welcome, Anonymous!
    ```

- Not on the weekend

   ```java
   today = LocalDate.of(2021, 8, 6)
   ```

    ```
    What is your username? admin
    Type the password for username admin: admin
    Welcome, admin!
    ```
    ```
    What is your username? Anonymous
    Type the password for username admin: 1234
    Credentials are invalid
    ```

---

### Task 4

Add a second set of credentials and define a new function named `isUserValid` with the input arguments `username` and `password`, both as a `String`.

```java
public static final String ADMIN_USER = "admin";
public static final String ADMIN_PWD = "admin";
public static final String JANIS_USER = "Janis";
public static final String JANIS_PWD = "joplin";
```

The function should return true if the credentials match either user or false if the credentials don't match.

When the user provided is invalid (when `isUserValid` returned false) our query should show the message `An error occurred. You are not authorized.`.

**Your result should look like this:**

```
What is your username? admin
Type the password for username admin: admin
```

```
What is your username? Janis
Type the password for username Janis: joplin
```

```
What is your username? Janis
Type the password for username Janis: hunter
An error occurred. You are not authorized.
```