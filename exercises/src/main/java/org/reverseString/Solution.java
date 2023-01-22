package org.reverseString;

public class Solution {
    public static void main(String[] args) {
        System.out.println(reverseString("test"));
        System.out.println(reverseString2("test"));
        System.out.println(reverseString(""));
        System.out.println(reverseString2(""));
        System.out.println(reverseString("a"));
        System.out.println(reverseString2("a"));
        System.out.println(reverseString("ab"));
        System.out.println(reverseString2("ab"));
        System.out.println(reverseString("somethingmuchbigger"));
        System.out.println(reverseString2("somethingmuchbigger"));
    }

    private static String reverseString(String original) {
        StringBuilder newString = new StringBuilder();
        char[] chars = original.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            newString.append(chars[chars.length - 1 - i]);
        }
        return newString.toString();
    }

    private static String reverseString2(String original) {
        StringBuilder newString = new StringBuilder();
        char[] chars = original.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            newString.append(chars[i]);
        }
        return newString.toString();
    }

}