public class Decomposition {
        public static double calculateArea(double radius) {
        double result = Math.PI * radius * radius;
        return result;
    }

    // Arbitrary method of calculateArea
    public static double calculateArea2(double radius) {
        return Math.PI * radius * radius;
    }

    // Step#1 - Stub method to validate parameter passing
    // public static double distance (double x1, double x2, double y1, double y2) {
    //     return 0.0;
    // }

    // Step#2 - Adding calculates dx and dy
    // public static double distance (double x1, double x2, double y1, double y2) {
    //     double dx = x2 - x1;
    //     double dy = y2 - y1;
    //     System.out.println("dx is " + dx);
    //     System.out.println("dy is " + dy);
    //     return 0.0;
    // }

    // Step#3 - Adding calculates dsquared
    // public static double distance (double x1, double x2, double y1, double y2) {
    //     double dx = x2 - x1;
    //     double dy = y2 - y1;
    //     double dsquared = dx * dx + dy * dy;
    //     System.out.println("dsquared is " + dsquared);
    //     return 0.0;
    // }

    // Final distance method
    public static double distance (double x1, double x2, double y1, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        double dsquared = dx * dx + dy * dy;
        double result = Math.sqrt(dsquared);
        return result;
    }

    // Composition method
    public static double circleArea(double xc, double yc, double xp, double yp) {
        double radius = distance(xc, yc, xp, yp);
        double area = calculateArea(radius);
        return area;
    }

    // Arbitrary method of circleArea
    public static double circleArea2(double xc, double yc, double xp, double yp) {
        return calculateArea(distance(xc, yc, xp, yp));
    }


    public static void main(String[] args) {
        // Calculate Area
        double area = calculateArea(5);
        System.out.println("Calculate area: " + area);

        // Distance between 2 point
        double dist = distance(1.0, 2.0, 4.0, 6.0);
        System.out.println("Distance: " + dist);

        // Calculate circle area
        double circle = circleArea(10, 20, 40, 60);
        System.out.println("Circle Area: " + circle);
    }
}