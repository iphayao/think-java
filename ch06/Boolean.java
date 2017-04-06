public class Boolean {
    /**
     * Tests whether x is a single digit integer
     * 
     * @param x the integer to test
     * @return true if x has one digit false otherwise
     */
    public static boolean isSingleDigit(int x) {
        if(x > -10 && x < 10) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isSingleDigit2(int x) {
        return x > -10 && x < 10;
    }

    public static void main(String[] args) {
        System.out.println(isSingleDigit(2));
        boolean bigFlag = !isSingleDigit(17);
        System.out.println(bigFlag);

        int z = 17;
        if(isSingleDigit(z)) {
            System.out.println("z is small");
        }
        else {
            System.out.println("z is big");
        }
    }
}