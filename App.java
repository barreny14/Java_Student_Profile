import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        input.nextLine();

        System.out.print("Enter your favourite programming language: ");
        String language = input.nextLine();

        System.out.print("Enter your study hours per week: ");
        double studyHours = input.nextDouble();

        boolean isAdult = age >= 18;

        greetings(name);
        System.out.println("\n---Student Profile---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Language: " + language);
        System.out.println("Hours: " + studyHours);
        System.out.println("Adult: " + isAdult);

        if (studyHours > 10) {
            System.out.println("Great study habit!");
        }else {
            System.out.println("Try to spend more time practicing!");
        }

        for (int i = 1; i <= 3; i++) {
            System.out.println("Keep learning " + language + "!");
        }
        }

        public static void greetings(String name) {
            System.out.println("Welcome, " + name + "!");
    }
}