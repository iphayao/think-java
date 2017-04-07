public class Loops {
    public static void countDown(int n) {
        while (n > 0) {
            System.out.println(n);
            n = n - 1;
        }
        System.out.println("Baseoff!");
    }

    public static void sequence(int n) {
        while(n != 1) {
            System.out.println(n);
            if(n % 2 == 0) {    // n is even
                n = n / 2;
            }
            else {              // n is odd
                n = n * 3 + 1;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Countdown");
        countDown(3);

        System.out.println("Sequence");
        sequence(3);
    }
}