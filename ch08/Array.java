import java.util.Arrays;
public class Array {

    public static void printArray(int[] a) {
        System.out.print("{" + a[0]);
        for(int i = 0; i < a.length; i++) {
            System.out.print("," + a[i]);
        }
        System.out.println("}");
    }

    public static int search(double[] a, double target) {
        for(int i = 0; i < a.length; i++) {
            if(a[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static double sum(double[] a) {
        double total = 0.0;
        for(int i = 0; i < a.length; i++) {
            total += a[i];
        }
        return total;
    }

    public static void main(String[] args) {
        int size = 10;
        int[] counts = new int[4];
        double[] values = new double[size];

        counts[0] = 7;
        counts[1] = counts[0] * 2;
        counts[2]++;
        counts[3] -= 60;

        System.out.println("The zeroth elements is " + counts[0]);

        int i = 0;
        while(i < 4) {
            System.out.println(counts[i]);
            i++;
        }

        for(int j = 0; j < 4; j++) {
            System.out.println(counts[j]);
        }

        int[] x = {1, 2, 3, 4};
        System.out.println(x);

        printArray(x);

        System.out.println(Arrays.toString(x));

        double[] a = new double[3];
        a[0] = 1.0;
        a[1] = 2.0;
        a[2] = 3.0;
        double[] b1 = a;
        System.out.println(Arrays.toString(b1));

        double[] b2 = new double[3];
        for(int k = 0; k < 3; k++) {
            b2[k] = a[k];
        }
        System.out.println(Arrays.toString(b2));

        double[] b3 = Arrays.copyOf(a, 3);
        System.out.println(Arrays.toString(b3));

        double[] b4 = new double[a.length];
        for(i = 0; i < a.length; i++) {
            b4[i] = a[i];
        }
        System.out.println(Arrays.toString(b4));

        double[] b5 = Arrays.copyOf(a, a.length);
        System.out.println(Arrays.toString(b5));

        for(i = 0; i < a.length; i++) {
            a[i] = Math.pow(a[i], 2.0);
        }
        System.out.println(Arrays.toString(a));



    }
}