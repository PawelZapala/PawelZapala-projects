package AlgoritmTasks;

public class LongestShortestWords {
    void findShortestAndLongestWord(String str) {
        String[] words = str.split(" ");
        int currentShortestLength = str.length();
        int currentLongestLength = 0;

        for (String word : words) {
            var currentWordLength = word.length();

            if (currentWordLength < currentShortestLength) {
                currentShortestLength = currentWordLength;
            }
            if (currentWordLength > currentLongestLength) {
                currentLongestLength = currentWordLength;
            }
        }

        System.out.print("Shortest words: ");
        for (String word : words) {
            if (word.length() == currentShortestLength) {
                System.out.print(word + " ");
            }
        }

        System.out.print("\nLongest words: ");
        for (String word : words) {
            if (word.length() == currentLongestLength) {
                System.out.print(word + " ");
            }
        }
    }

    public static void main(String[] args) {
        LongestShortestWords obj = new LongestShortestWords();
        String str = "For given text find the longest and the shortest words";
        str += " ";
        obj.findShortestAndLongestWord(str);
    }
}
