package Lambdas;

import java.util.function.Function;

public class LambdaTester{
    public static void main(String[] args) {

        String originalText = "Some text message";

        String upperCaseText = modifyString(originalText, String::toUpperCase);
        System.out.println(upperCaseText);

        String lowerCaseText = modifyString(originalText, String::toLowerCase);
        System.out.println(lowerCaseText);

        String firstLetterOfText = modifyString(originalText, string -> String.valueOf(string.charAt(0)));
        System.out.println(firstLetterOfText);

        String lastLetterOfText = modifyString(originalText, string -> String.valueOf(string.charAt(string.length() - 1)));
        System.out.println(lastLetterOfText);

        Integer letterCounter = stringToInteger(originalText, String::length);
        System.out.println(letterCounter);

        Integer wordCounter = stringToInteger(originalText, string -> string.split(" ").length);
        System.out.println(wordCounter);

    }

    private static String modifyString(String string, Function<String, String> modifier){
        return modifier.apply(string);
    }

    private static Integer stringToInteger(String string, Function<String, Integer> function){
        return  function.apply(string);
    }

}

