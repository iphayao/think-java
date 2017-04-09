import java.awt.Point;
import java.awt.Rectangle;

public class PointRect {
    public static void printPoint(Point p) {
        System.out.println("(" + p.x + ", " + p.y + ")");
    }

    public static double distance(Point p1, Point p2) {
        int dx = p2.x - p1.x;
        int dy = p2.y - p1.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static Point findCenter(Rectangle box) {
        int x = box.x + box.width / 2;
        int y = box.y + box.height / 2;
        return new Point(x, y);
    }

    public static void moveRect(Rectangle box, int dx, int dy) {
        box.x = box.x + dx;
        box.y = box.y + dy;
    }

    public static void main(String[] args) {
        Point blank;
        blank = new Point(3, 4);

        System.out.println(blank.x + ", " + blank.y);
        int sum  = blank.x * blank.x + blank.y * blank.y;
        System.out.println(sum);

        // Objects as parameters
        
        printPoint(blank);
        System.out.println(blank);

        // Objects as return types

        Rectangle box = new Rectangle(0, 0, 100, 200);
        System.out.println(box);

        System.out.println(findCenter(box));

        // Mutable objects

        box.x = box.x + 50;
        box.y = box.y + 100;
        System.out.println(box);

        box = new Rectangle(0, 0, 100, 200);
        moveRect(box, 50, 100);
        System.out.println(box);

        box = new Rectangle(0, 0, 100, 200);
        box.translate(50, 100);
        System.out.println(box);

        // Aliasing

        Rectangle box1 = new Rectangle(0, 0, 100, 200);
        Rectangle box2 = box1;

        System.out.println(box2.width);
        box1.grow(50, 50);
        System.out.println(box2.width);

        // The null keyword

        blank = null;
        // int x = blank.x;         // NullPointerException
        // blank.translate(50, 50); // NullPointerException
    }
}