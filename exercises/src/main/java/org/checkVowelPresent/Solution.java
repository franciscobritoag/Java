package org.checkVowelPresent;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isVowelPresent("chsdksdf"));
        System.out.println(isVowelPresent("kasjbda"));
    }

    private static boolean isVowelPresent(String input) {
        return input.matches(".*[aeiou].*");
    }
}
