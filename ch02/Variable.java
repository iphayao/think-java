public class Variable {
    public static void main(String[] args) {

        // Declaring variable
        String message;
        int x;

        String firstName;
        String lastName;
        int hours, minute;

        // Assignment
        message = "Hello!"; // give message the value "Hello!"
        hours = 11;         // assign the value 11 to hour
        minute = 59;        // set minute to 59

        message = "123";    // legal
        //message = 123;    // not legal

        // Initialized valiable
        String message2 = "Hello!";
        int hours2 = 11;
        int minute2 = 59;

        // Stage diagrames
        int a = 5;
        int b = a;          // a and b are now equal
        a = 3;              // a and b are no longer equal

        // Printing variables
        String firstLine = "Hello, again!";
        System.out.println(firstLine);

        System.out.print("The value of firstLine is ");
        System.out.println(firstLine);

        int hours3 = 11;
        int minute3 = 59;
        System.out.print("The current time is ");
        System.out.print(hours3);
        System.out.print(":");
        System.out.print(minute3);
        System.out.println(".");

        // Arithmetic operators
        int hours4 = 11;
        int minute4 = 59;
        System.out.print("Number of minute since midnight: ");
        System.out.println(hours4 * 60 * minute4);

        System.out.print("Fraction of the hour that has passed: ");
        System.out.println(minute4 / 60);

        System.out.print("Percent of the hour that has passed: ");
        System.out.println(minute4 * 100 / 60);

        // Floating point Number
        double pi;
        pi = 3.14159;
        
        double minute5 = 59.0;
        System.out.print("Fraction of the hour that has passed");
        System.out.println(minute5 / 60.0);

        //int x = 1.1           // Complier error
        //double y = 1;         // legal, but bad style
        //double y = 1 / 3;     // common mistake

        double y = 1.0 / 3.0;   // correct

        // Rounding errors
        System.out.println(0.1 * 10);
        System.out.println(0.1 + 0.1 + 0.1 + 0.1 + 0.1
                          +0.1 + 0.1 + 0.1 + 0.1 + 0.1);

        double balance = 123.45;    // potential rounding error
        int balance2 = 12345;        // total number of cents

        System.out.println(1 + 2 + "Hello");    // the output is 3Hello
        System.out.println("Hello" + 1 + 2);    // the output is Hello12

        // Composition
        System.out.println(17 * 3);
        System.out.println(hours * 60 + minute);
        
        int percentage;
        percentage = (minute * 100) / 60;

        hours = minute + 1; // correct
        //minute + 1 = hours; // complier error

    }
}