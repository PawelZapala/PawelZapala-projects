package AlgoritmTasks;

import java.util.LinkedHashMap;
import java.util.Map;

public class LetterCounter {
    public static void counter (String str) {
        str = str.replace(" ", "");
        Map counter = new LinkedHashMap<Character, Integer>();
        for (char ch : str.toCharArray()){
            if (counter.containsKey(ch)){
                counter.put(ch, (Integer) counter.get(ch) + 1);
            } else {
                counter.put(ch, 1);
            }
        }
        System.out.println(counter);
    }

    public static void main(String[] args) {
        String text = "This is a test text";
        counter(text);
    }
}




