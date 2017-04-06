public class Return {

    public static double absoluteValue(double x) {
        if(x < 0) {
            return -x;
        }
        else {
            return x;
        }
    }

    // public static double absoluteValue(double x) {
    //     if(x < 0) {
    //         return -x;
    //     }
    //     else {
    //         return x;
    //     }
    //     System.out.println("This line is dead code"); // <<- Dead Code HERE!
    // }

    // public static double absoluteValue(double x) {
    //     if(x < 0) {
    //         return -x;
    //     }
    //     else if(x > 0) {
    //         return x;
    //     }
    //     // Syntax Error <<- No resturn statement
    // }

    public static void main(String[] args) {
        // Absoluted value
        double absoluted = absoluteValue(-5);
        System.out.println("Absoluted value: " + absoluted);
    }
}