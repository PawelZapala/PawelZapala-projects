package Lambdas;

import java.util.function.Function;

public class LambdaTester{
    public static void main(String[] args) {

        String originalText = "Some text message";

        String modifiedText = modifyString(originalText, String::toUpperCase);
        System.out.println(modifiedText);

        modifiedText = modifyString(originalText, String::toLowerCase);
        System.out.println(modifiedText);

        modifiedText = modifyString(originalText, string -> String.valueOf(string.charAt(0)));
        System.out.println(modifiedText);

        modifiedText = modifyString(originalText, string -> String.valueOf(string.charAt(string.length() - 1)));
        System.out.println(modifiedText);

        Integer letterChecker = stringToInteger(originalText, String::length);
        System.out.println(letterChecker);

        letterChecker = stringToInteger(originalText, string -> string.split(" ").length);
        System.out.println(letterChecker);

    }

    private static String modifyString(String string, Function<String, String> modifier){
        return modifier.apply(string);
    }

    private static Integer stringToInteger(String string, Function<String, Integer> function){
        return  function.apply(string);
    }

}

