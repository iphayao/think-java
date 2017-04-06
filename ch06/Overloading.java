public class Overloading {

    public static double calculateArea(double radius) {
        double result = Math.PI * radius * radius;
        return result;
    }

    public static double distance (double x1, double x2, double y1, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        double dsquared = dx * dx + dy * dy;
        double result = Math.sqrt(dsquared);
        return result;
    }
    public static double calculateArea(double xc, double yc, double xp, double yp) {
        return calculateArea(distance(xc, yc, xp, yp));
    }

    public static void main(String[] args) {
        double area = calculateArea(3.0);
        System.out.println("Calcucate area: ");
        double circle = calculateArea(1.0, 2.0, 4.0, 6.0);
        System.out.println("Calculate circle area: " + circle);

    }
}