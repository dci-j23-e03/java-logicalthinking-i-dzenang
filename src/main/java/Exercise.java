import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Exercise {

  public static final String ADMIN_USER = "admin";
  public static final String ADMIN_PWD = "admin";
  public static final String ADMIN_TYPE = "teacher";
  public static final String JANIS_USER = "Janis";
  public static final String JANIS_PWD = "joplin";
  public static final String JANINS_TYPE = "student";


  public static void main (String[] args) {
    Exercise exercise = new Exercise();
    Scanner scanner = new Scanner(System.in);

    // Task 1
    exercise.loginCredentials(scanner);

    // Task 2
    System.out.println("\n\n");
    System.out.println(exercise.isWeekend());
    System.out.println(exercise.isWeekend(LocalDate.of(2021, 8, 6)));
    System.out.println(exercise.isWeekend(LocalDate.of(2021, 8, 7)));
    System.out.println(exercise.isWeekend(LocalDate.of(2021, 8, 8)));
    System.out.println(exercise.isWeekend(LocalDate.of(2021, 8, 9)));

    // Task 3
    System.out.println("\n\n");
    LocalDate date = LocalDate.of(2021, 8, 7);
    exercise.loginCredentialsOpenDoor(scanner, date);
    System.out.println("\n");
    date = LocalDate.of(2021, 8, 6);
    exercise.loginCredentialsOpenDoor(scanner, date);

    // Task 4
    exercise.loginCredentialsMultipleUsers(scanner);
  }

  private void loginCredentials(Scanner scanner) {
    System.out.println("What is your username?");
    String username = scanner.nextLine();

    System.out.println("Type the password for username " + username + ":");
    String password = scanner.nextLine();

    // TODO write your code here
  }

  private boolean isWeekend() {
    // TODO write your code here
  }

  private boolean isWeekend(LocalDate date) {
    // TODO write your code here
  }

  private void loginCredentialsOpenDoor(Scanner scanner, LocalDate date) {
    System.out.println("What is your username?");
    String username = scanner.nextLine();

    System.out.println("Type the password for username " + username + ":");
    String password = scanner.nextLine();

    // TODO write your code here
  }

  private void loginCredentialsMultipleUsers(Scanner scanner) {
    System.out.println("What is your username?");
    String username = scanner.nextLine();

    System.out.println("Type the password for username " + username + ":");
    String password = scanner.nextLine();

    // TODO write your code here
  }

  private boolean isUserValid(String username, String password) {
    // TODO write your code here
  }
}
