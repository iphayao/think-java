import java.util.Scanner;
/**
 * Converts centimeters to feet and inches.
 */
public class Convert {
    public static void main(String[] args) {
        double cm;
        int feet, inches, remiander;
        final double CM_PER_INCH = 2.54;
        final int IN_PER_FOOT = 12;
        Scanner in = new Scanner(System.in);

        // Promp the user and get the value
        System.out.print("Exactly, How many cm? ");
        cm = in.nextDouble();

        // Convert and output the result
        inches = (int)(cm / CM_PER_INCH);
        feet = inches / IN_PER_FOOT;
        remiander = inches % IN_PER_FOOT;
        
        System.out.printf("%.2f cm = %d ft, %d in\n", cm, inches, feet);

    }
}
