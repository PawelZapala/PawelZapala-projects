package CollectionFramework;

import java.util.LinkedHashSet;
import java.util.Set;


public class UniqueLetters {
    public static void main(String[] args) {

        String text = "This is a test text";
        String[] chars = text.split("");
        Set<String> uniqueChars = new LinkedHashSet<>();
        for (String s : chars) {
            uniqueChars.add(s);
        }
        System.out.println(uniqueChars);
    }
}
