import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));

        int max = Integer.MAX_VALUE;
        for(String arg : args) {
            int value = Integer.parseInt(arg);
            if(value > max) {
                max = value;
            }
        }
        System.out.println("The max is " + max);
    }
}