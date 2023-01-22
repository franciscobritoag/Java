package org.removeSpaces;

public class Solution {
    public static void main(String[] args) {
        System.out.println(removeWhitespaces("tenet"));
        System.out.println(removeWhitespaces("What a miss! God"));
    }

    private static String removeWhitespaces(String input) {
        StringBuilder builder = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (!Character.isWhitespace(c)) builder.append(c);
        }
        return builder.toString();
    }
}
