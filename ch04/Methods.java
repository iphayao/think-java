public class Methods {
    public static void main(String[] args) {

        // Math squar root
        double root = Math.sqrt(17.0);

        // Math Sin
        double angle = 1.5;
        double height = Math.sin(angle);
        System.out.println("height: " + height);

        // Manual convert degree to angle
        double degree = 90;
        double angle2 = degree / 180.0 * Math.PI;
        System.out.println("angle: " + angle2);

        // Math convert to radians and to degrees
        double radians = Math.toRadians(180.0);
        double degrees = Math.toDegrees(Math.PI);
        System.out.println("radians: " + radians);
        System.out.println("degrees: " + degrees);
        
        // Math Round
        long x1 = Math.round(Math.PI * 20);
        System.out.println("Rounded PI: " + x1);
        
        // Math Cosine
        double x2 = Math.cos(angle + Math.PI / 2.0);
        System.out.println("consine: " + x2);
        
        // Math Exponential
        double x3 = Math.exp(Math.log(10.0));
        System.out.println("exp of log: " + x3);
        
        // Math power by
        double x4 = Math.pow(2.0, 10.0);
        System.out.println("power by: " + x4);
    }
}