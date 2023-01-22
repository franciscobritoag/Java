package org.swapTwoNumbers;

public class Solution {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before swapping: a -> " + a + "; b -> " + b);
        b = b + a;
        a = b - a;
        b = b - a;
        System.out.println("After swapping: a -> " + a + "; b -> " + b);
    }
}
