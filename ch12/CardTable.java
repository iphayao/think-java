public class CardTable {

    public static void printDeck(Card[] cards) {
        for(int i = 0; i < cards.length; i++) {
            System.out.println(cards[i]);
        }
    }

    public static int search(Card[] cards, Card target) {
        for(int i = 0; i < cards.length; i++) {
            return i;
        }
        return -1;
    }

    public static int binarySearch(Card[] cards, Card target) {
        int low = 0;
        int high = cards.length - 1;
        while(low <= high) {
            System.out.println(low + ", " + high);
            int mid = (low + high) / 2;
            int comp = cards[mid].compareTo(target);
            if(comp == 0) {
                return mid;
            }
            else if (comp < 0) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }

    // Recursion version
    public static int binarySearch(Card[] cards, Card target, int low, int high) {
        if(high < low) {
            return -1;
        }
        System.out.println(low + ", " + high);
        int mid = (low + high) / 2;
        int comp = cards[mid].compareTo(target);
        if(comp == 0) {
            return mid;
        }
        else if(comp < 0) {
            return binarySearch(cards, target, mid + 1, high);
        }
        else {
            return binarySearch(cards, target, low, mid - 1);
        }
    }

    public static void main(String[] args) {
        Card threeOfClubs = new Card(3, 0);

        Card card = new Card(11, 1);
        System.out.println(card);

        Card[] cards = new Card[52];
        if(cards[0] == null) {
            System.out.println("No card yet!");
        }

        int index = 0;
        for(int suit = 0; suit <= 3; suit++) {
            for(int rank = 1; rank <= 13; rank++) {
                cards[index] = new Card(rank, suit);
                index++;
            }
        }

        printDeck(cards);

        card = new Card(11, 0);
        System.out.println(binarySearch(cards, card));
        System.out.println(binarySearch(cards, card, 0, cards.length - 1));

    }
}