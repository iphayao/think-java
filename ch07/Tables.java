public class Tables {

    public static void example1() {
        int i = 1;
        while(i < 10) {
            double x = i;
            System.out.println(x + " " + Math.log(x));
            i = i + 1;
        }
    }

    public static void example2() {
        int i = 1;
        while(i < 10) {
            double x = i;
            System.out.println(x + " " + Math.log(x) / Math.log(2));
            i = i + 1;
        }
    } 

    public static void example3() {
        final double LOG2 = Math.log(2);
        int i = 1;
        while(i < 100) {
            double x = i;
            System.out.println(x + " " + Math.log(x) / LOG2);
            i = i * 2;
        }
    }

    public static void example4() {
        int i = 1;
        while(i <= 6) {
            System.out.printf("%4d", 2 * i);
            i = i + 1;
        }
        System.out.println();
    }

    public static void printRow(int n) {
        int i = 1;
        while(i <= 6) {
            System.out.printf("%4d", n * i);
            i = i + 1;
        }
        System.out.println();
    }

    public static void printRow(int n, int cols) {
        int i = 1;
        while(i <= cols) {
            System.out.printf("%4d", n * i);
            i = i + 1;
        }
        System.out.println();
    }

    public static void printRow2(int n, int cols) {
        for(int i = 1; i <= cols; i = i + 1) {
            System.out.printf("%4d", n * i);
        }
        //System.out.println(i);
    }

    public static void printRow3(int n, int cols) {
        int i;
        for(i = 1; i <= cols; i = i + 1) {
            System.out.printf("%4d", n * i);
        }
        System.out.println(i);
    }

    public static void printTable() {
        int i = 1;
        while(i <= 6) {
            printRow(i);
            i = i + 1;
        }
    }

    public static void printTable(int rows) {
        int i = 1;
        while(i <= rows) {
            printRow(i, rows);
            i = i + 1;
        }
    }

    public static void printTable2(int rows) {
        int i = 1;
        while(i <= rows) {
            printRow(i, i);
            i = i + 1;
        }
    }

    public static void printTable3(int rows) {
        for(int i = 1; i <= rows; i = i + 1) {
            printRow(i, rows);
        }
    }

    public static void main(String[] args) {
        System.out.println("Example 1");
        example1();

        System.out.println("Example 2");
        example2();

        System.out.println("Example 3");
        example3();

        System.out.println("Example 4");
        example4();

        System.out.println("PrintRow");
        printRow(5);

        System.out.println("PrintTable");
        printTable();

        System.out.println("PrintTable");
        printTable(7);

        System.out.println("PrintTable2");
        printTable2(7);

        System.out.println("PrintTable3");
        printTable3(7);

        System.out.println("PrintRow3");
        printRow3(4, 4);
    }
}