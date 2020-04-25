package CollectionFramework;

import java.util.HashSet;
import java.util.Set;

public class UniqueLetters {
    public static void main(String[] args) {
        Set<String> letters = new HashSet<>();
        letters.add("T");
        letters.add("h");
        letters.add("i");
        letters.add("s");
        letters.add("i");
        letters.add("s");
        letters.add("a");
        letters.add("t");
        letters.add("e");
        letters.add("x");
        letters.add("t");

        System.out.println(letters);
    }
}
