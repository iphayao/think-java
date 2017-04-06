public class Recursion {
    public static void countDown(int n) {
        if(n == 0) {
            System.out.println("Blastoff!");
        }
        else {
            System.out.println(n);
            countDown(n - 1);
        }
    }

    public static void countUp(int n) {
        if(n == 0) {
            System.out.println("Blastoff!");
        }
        else {
            countUp(n - 1);
            System.out.println(n);
        }
    }

    public static void nLines(int n) {
        if(n > 0) {
            System.out.println();
            nLines(n - 1);
        }
    }

    public static void forever(String s) {
        System.out.println(s);
        forever(s);
    }

    public static void displayBinary(int value) {
        if(value > 0) {
            displayBinary(value / 2);
            System.out.print(value % 2);
        }
    }

    public static void main(String[] args) {
        System.out.println("Counting down: ");
        countDown(3);

        System.out.println("Counting up: ");
        countUp(3);

        System.out.println("New lines: ");
        nLines(3);

        //System.out.println("Forever: ");
        //forever("test");

        System.out.println("Diaplay binary: ");
        displayBinary(23);
    }
}