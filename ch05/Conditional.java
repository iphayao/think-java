public class Conditional {
    public static void main(String[] args) {
        int x = 2;

        // if condition
        if(x > 0) {
            System.out.println("x is positive");
        }

        // if-else condition
        if(x % 2 == 0) {
            System.out.println("x is even");
        }
        else {
            System.out.println("x is odd");
        }

        // chaining statement >> if-else if-else condition
        if(x > 0) {
            System.out.println("x is positive");
        }
        else if(x < 0) {
            System.out.println("x is negative");
        }
        else {
            System.out.println("x is zero");
        }

        // nest statement
        if(x == 0) {
            System.out.println("x is zero");
        }
        else {
            if(x > 0) {
                System.out.println("x is positive");
            }
            else {
                System.out.println("x is negative");
            }
        }

        boolean flage;
        flage = true;
        boolean testResult = false;

        boolean evenFlag = (x % 2 == 0);    // true if x is even
        boolean positiveFlag = (x > 0);     // true if x is possitive

        if(evenFlag) {
            System.out.println("n was even when I checked it");
        }

        if(!evenFlag) {
            System.out.println("n was odd when I checked it");
        }

    }
}