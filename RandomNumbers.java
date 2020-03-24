import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
public class RandomNumbers {
    public static void main(String[] args) {
        int[] anArray = new int[10];
        for (int a=0; a < anArray.length; a++) {
            anArray[a] = ThreadLocalRandom.current().nextInt(100);
        }
            System.out.println(Arrays.toString(anArray));
    }
}
