import java.util.Scanner;

public class Logarithm {
    public static void printLogarithm(double x) {
        if(x < 0.0) {
            System.out.println("Error: x must be positive");
            return;
        }
        double result = Math.log(x);
        System.out.println("The log of x is " + result);
    }

    public static void scanDouble(Scanner in) {
        System.out.print("Enter a number: ");
        double x = in.nextDouble();
        printLogarithm(x);
    }

    public static void scanDouble2(Scanner in) {
        System.out.print("Enter a number: ");
        if(!in.hasNextDouble()) {
            String word = in.next();
            System.err.println(word + " is not a number");
        }
        double x = in.nextDouble();
        printLogarithm(x);
    }

    public static void main(String[] args) {
        System.out.println("print logarithm: ");
        printLogarithm(3.3);

        Scanner in = new Scanner(System.in);
        System.out.println("print logarithm by scanDouble");
        scanDouble(in);

        System.out.println("print logarithm by scanDouble2");
        scanDouble2(in);
    }
}