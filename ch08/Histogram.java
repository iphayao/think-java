import java.util.Random;
public class Histogram {
    public static int[] randomArray(int size) {
        Random random = new Random();
        int[] a = new int[size];
        for(int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        return a;
    }

    public static int inRange(int[] a, int low, int high) {
        int count = 0;
        for(int i = 0; i < a.length; i++) {
            if(a[i] >= low && a[i] < high) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int numValues = 8;
        int[] array = randomArray(numValues);
        printArray(array);
        
        int[] scores = randomArray(30);
        int a = inRange(scores, 90, 100);
        int b = inRange(scores, 80, 90);
        int c = inRange(scores, 70, 80);
        int d = inRange(scores, 60, 70);
        int e = inRange(scores, 0, 60);

        int[] counts = new int[100];
        for(int i = 0; i < scores.length; i++) {
            int index = scores[i];
            counts[index]++;
        }

        counts = new int[100];
        for(int score : scores) {
            counts[score]++;
        }
    }
}