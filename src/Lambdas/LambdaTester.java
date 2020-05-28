package Lambdas;

import java.util.function.Function;

public class LambdaTester{
    public static void main(String[] args) {

        String originalString = "Some text message";

        String modifiedText = modifyString(originalString, String::toUpperCase);
        System.out.println(modifiedText);

        modifiedText = modifyString(originalString, String::toLowerCase);
        System.out.println(modifiedText);

        modifiedText = modifyString(originalString, string -> String.valueOf(string.charAt(0)));
        System.out.println(modifiedText);

        modifiedText = modifyString(originalString, string -> String.valueOf(string.charAt(string.length() - 1)));
        System.out.println(modifiedText);

        Integer checker = anotherMethod(originalString, String::length);
        System.out.println(checker);

        checker = anotherMethod(originalString, string -> string.split(" ").length);
        System.out.println(checker);

    }

    private static String modifyString(String string, Function<String, String> modifier){
        return modifier.apply(string);
    }

    private static Integer anotherMethod(String string, Function<String, Integer> function){
        return  function.apply(string);
    }

}

