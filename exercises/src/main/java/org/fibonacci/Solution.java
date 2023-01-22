package org.fibonacci;

public class Solution {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = a + b;

        System.out.println("Fibonacci:");
        int count = 15;

        for (int i = 0; i < count; i++) {
            System.out.println(a);
            a = b;
            b = c;
            c = a + b;
        }
    }
}
