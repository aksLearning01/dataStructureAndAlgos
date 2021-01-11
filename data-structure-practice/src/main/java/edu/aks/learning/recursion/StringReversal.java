package edu.ask.learning.ds.string;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringReversal {


    public static void main(String[] args) throws Exception {
        System.out.println("Please provide the input ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println("The input string is as :: " + input);


        System.out.println("Reversal of the input using various techniques >>>>");
        System.out.println("1. --------- Using Loop ---------- ::" + reversePattern1(input));
        System.out.println("2. --------- Using Recursion ---------- ::" + reversePattern2(input));
        System.out.println("3. --------- Using Arrays ----------::" + reversePattern3(input));
        System.out.println("3. --------- Using String Builder ----------::" + reversePattern4(input));
    }

    private static String reversePattern1(String input) {
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            result = input.charAt(i) + result;
        }
        return result;
    }

    private static String reversePattern2(String input) {
        String reverse = "";
        if (input.length() == 1) return input;
        while (input.length() > 1) {
            reverse = input.charAt(input.length() - 1) + reversePattern2(input.substring(0, input.length() - 1));
            return reverse;
        }
        return null;
    }

    private static String reversePattern3(String input) {
        String reverse = "";
        char[] arr = input.toCharArray();
        for (char c : arr) {
            reverse = c + reverse;
        }
        return reverse;
    }


    private static String reversePattern4(String input) {
        String reverse = "";
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        return sb.toString();
    }

}

