import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Exercise {

    public static final String ADMIN_USER = "admin";
    public static final String ADMIN_PWD = "admin";
    public static final String ADMIN_TYPE = "teacher";
    public static final String JANIS_USER = "Janis";
    public static final String JANIS_PWD = "joplin";
    public static final String JANINS_TYPE = "student";


    public static void main(String[] args) {
        Exercise exercise = new Exercise();
        Scanner scanner = new Scanner(System.in);

//        // Task 1
//        System.out.println("=====Testing loginCredentials=====");
//        exercise.loginCredentials(scanner);
//        System.out.println("\n\n");

//        // Task 2
//        System.out.println("=====Testing loginCredentials=====");
//        System.out.println(exercise.isWeekend()); // false
//        System.out.println(exercise.isWeekend(LocalDate.of(2024, Month.FEBRUARY, 3))); // true
//        System.out.println(exercise.isWeekend(LocalDate.of(2021, 8, 6))); // false
//        System.out.println(exercise.isWeekend(LocalDate.of(2021, 8, 7))); // true
//        System.out.println(exercise.isWeekend(LocalDate.of(2021, 8, 8))); // true
//        System.out.println(exercise.isWeekend(LocalDate.of(2021, 8, 9))); // false
//        System.out.println("\n\n");

//        // Task 3
//        System.out.println("=====Testing loginCredentialsOpenDoor=====");
//        LocalDate date = LocalDate.of(2021, 8, 7);
//        exercise.loginCredentialsOpenDoor(scanner, date);
//        System.out.println("\n");
//        date = LocalDate.of(2021, 8, 6);
//        exercise.loginCredentialsOpenDoor(scanner, date);
//        System.out.println("\n\n");

        // Task 4
        System.out.println("=====Testing loginCredentialsMultipleUsers=====");
        exercise.loginCredentialsMultipleUsers(scanner);

        scanner.close();
    }

    private void loginCredentials(Scanner scanner) {
        System.out.println("What is your username?");
        String username = scanner.nextLine();

        System.out.println("Type the password for username " + username + ":");
        String password = scanner.nextLine();

        if (ADMIN_USER.equals(username) && ADMIN_PWD.equals(password)) {
            System.out.println("Welcome, " + username);
        } else {
            System.out.println("Credentials are invalid!");
        }
    }

    private boolean isWeekend() {
        return isWeekend(LocalDate.now());
    }

    private boolean isWeekend(LocalDate date) {
        return date.getDayOfWeek() == DayOfWeek.SATURDAY || date.getDayOfWeek() == DayOfWeek.SUNDAY;
    }

    private void loginCredentialsOpenDoor(Scanner scanner, LocalDate date) {
        System.out.println("What is your username?");
        String username = scanner.nextLine();

        System.out.println("Type the password for username " + username + ":");
        String password = scanner.nextLine();

        if (ADMIN_USER.equals(username) && ADMIN_PWD.equals(password)) {
            System.out.println("Welcome, " + username);
        } else if (isWeekend(date)) {
            System.out.println("Welcome, Anonymous!");
        } else {
            System.out.println("Credentials are invalid!");
        }
    }

    private void loginCredentialsMultipleUsers(Scanner scanner) {
        System.out.println("What is your username?");
        String username = scanner.nextLine();

        System.out.println("Type the password for username " + username + ":");
        String password = scanner.nextLine();

        if (!isUserValid(username, password)) {
            System.out.println("An error occurred. You are not authorized.");
        }
    }

    private boolean isUserValid(String username, String password) {
        return (ADMIN_USER.equals(username) && ADMIN_PWD.equals(password)) ||
                (JANIS_USER.equals(username) && JANIS_PWD.equals(password));
    }
}
