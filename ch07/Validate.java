import java.util.Scanner;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Validate {
    public static double scanDouble() {
        Scanner in = new Scanner(System.in);
        boolean okey;
        do {
            System.out.print("Enter a number: ");
            if(in.hasNextDouble()) {
                okey = true;
            }
            else {
                okey = false;
                String word = in.next();
                System.out.println(word + " is not a number");
            }
        } while(!okey);
        double x = in.nextDouble();
        return x;
    }

    public static double scanDouble2() {
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.print("Enter a number: ");
            if(in.hasNextDouble()) {
                break;
            }
            String word = in.next();
            System.out.println(word + " is not a number");
        }
        double x = in.nextDouble();
        return x;
    }

    public static double addNumber() {
        Scanner in = new Scanner(System.in);
        int x = -1;
        int sum = 0;
        while(x != 0) {
            x = in.nextInt();
            if(x <= 0) {
                continue;
            }
            System.out.println("Adding " + x);
            sum += x;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("ScanDouble: ");
        System.out.println(scanDouble());

        System.out.println("ScanDouble2: ");
        System.out.println(scanDouble2());

        System.out.println("AddNumber: ");
        System.out.println(addNumber());
    }
}