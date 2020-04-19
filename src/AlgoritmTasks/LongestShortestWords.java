package AlgoritmTasks;

public class LongestShortestWords {
        void findShortestAndLongestWord (String str){
            String shortestWord = "", longestWord = "";
            String words[]=str.split(" ");
            int s=str.length(),l=0;
            for (String word : words) {
                if (word.length() < s) {
                    shortestWord = word;
                    s = word.length();
                }
                if (word.length() > l) {
                    longestWord = word;
                    l = word.length();
                }
            }
            System.out.println("Shortest word: " + shortestWord);
            System.out.println("Longest word: " + longestWord);
        }
    public static void main(String[] args) {
        LongestShortestWords obj=new LongestShortestWords();
        String str = "For given text find the longest and the shortest words";
        str+=" ";
        obj.findShortestAndLongestWord(str);
    }
}
