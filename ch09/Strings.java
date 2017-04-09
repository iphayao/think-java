import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Strings {

    public static String reverse(String s) {
        String r = "";
        for(int i = s.length() - 1; i >= 0; i--) {
            r = r + s.charAt(i);
        }
        return r;
    }

    public static void main(String[] args) {

        // Characters

        String fruit = "banana";
        char letter = fruit.charAt(0);
        
        System.out.println(letter);
        
        letter = fruit.charAt(1);
        if(letter == 'a') {
            System.out.println('?');
        }

        System.out.print("Random alphabet: ");
        for(char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c);
        }
        System.out.println();

        System.out.print("Greek alphabet: ");
        for(int i = 913; i <= 937; i++) {
            System.out.print((char) i);
        }
        System.out.println();

        // Strings are immmutable

        String name = "Alan Turing";
        String upperName = name.toUpperCase();
        System.out.println("name:       " + name);
        System.out.println("upperName:  " + upperName);
        
        String text = "Computer Science is fun!";
        String text2 = text.replace("Computer Science", "CS");
        
        System.out.println(text);
        System.out.println(text2);

        // String traversal
        
        for(int i = 0; i < fruit.length(); i++) {
            letter = fruit.charAt(i);
            System.out.println(letter);
        }

        for(char l : fruit.toCharArray()) {
            System.out.println(l);
        }

        int length = fruit.length();
        // char last = fruit.charAt(length);
        char last = fruit.charAt(length - 1);

        // Substrings

        System.out.println("fruit reserse: " + reverse(fruit));

        System.out.println("fruit substring 0: " + fruit.substring(0));
        System.out.println("fruit substring 2: " + fruit.substring(2));
        System.out.println("fruit substring 6: " + fruit.substring(6));

        System.out.println("fruit substring(0, 3): " + fruit.substring(0, 3));
        System.out.println("fruit substring(2, 5): " + fruit.substring(2, 5));
        System.out.println("fruit substring(6, 6): " + fruit.substring(6, 6));

        // indexOf method

        int index1 = fruit.indexOf('a');
        int index2 = fruit.indexOf('a', 2);

        System.out.println(index1);
        System.out.println(index2);

        // String comparison

        String name1 = "Alan Turing";
        String name2 = "Ada Lovelace";
        if(name1 == name2) {
            System.out.println("The names are the same.");
        }

        if(name1.equals(name2)) {
            System.out.println("The names are the same.");
        }

        int diff = name1.compareTo(name2);
        if(diff == 0) {
            System.out.println("The names are the same.");
        }
        else if(diff < 0) {
            System.out.println("name1 comes before name2");
        }
        else if(diff > 0) {
            System.out.println("name2 comes before name1");
        }
        
        // Wrapper class

        String str = "12345";
        int num = Integer.parseInt(str);

        num = 12345;
        str = Integer.toString(num);

    }
}