package org.palindrome;

public class Solution {
    public static void main(String[] args) {
        System.out.println(checkPalindrome("tenet"));
        System.out.println(checkPalindrome("tennet"));
        System.out.println(checkPalindrome("tenneet"));
        System.out.println(checkPalindrome("a"));
        System.out.println(checkPalindrome("ab"));
        System.out.println(checkPalindrome("aba"));
        System.out.println(checkPalindrome("aba"));
    }

    private static boolean checkPalindrome(String input) {
        int length = input.length();
        if (length < 2) return true;
        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - 1 - i)) return false;
        }
        return true;
    }
}
