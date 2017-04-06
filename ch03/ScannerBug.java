import java.util.Scanner;
public class ScannerBug {
    public static void main(String[] args) {
        String name;
        int age;
        Scanner in = new Scanner(System.in);

        // Work fine
        System.out.print("What is your name? ");
        name = in.nextLine();
        System.out.print("What is your age? ");
        age = in.nextInt();
        System.out.printf("Hello %s, age %d\n", name, age);

        // Error occured
        System.out.print("What is your age? ");
        age = in.nextInt();
        System.out.print("What is your name? ");
        name = in.nextLine();
        System.out.printf("Hello %s, age %d\n", name, age);

        // Fixed
        System.out.print("What is your age? ");
        age = in.nextInt();
        in.nextLine();  // Read new line
        System.out.print("What is your name? ");
        name = in.nextLine();
        System.out.printf("Hello %s, age %d\n", name, age);

    }
}