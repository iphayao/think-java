public class Recursion {
    public static void countUp(int n) {
        if(n == 0) {
            System.out.println("Blastoff!");
        }
        else {
            countUp(n - 1);
            System.out.println(n);
        }
    }
    
    public static int factorial(int n) {
        if(n == 0) {
            return 1;
        }
        int recurse = factorial(n - 1);
        int result = n * recurse;
        return result;
    }

    public static int fibonacci(int n) {
        if(n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        countUp(3);
        System.out.println("Have a nice day.");
        System.out.println("Factorial: " + factorial(3));
        System.out.println("Fibonacci: " + fibonacci(3));
    }
}