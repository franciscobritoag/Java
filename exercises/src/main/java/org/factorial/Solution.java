package org.factorial;

public class Solution {
    public static void main(String[] args) {
        System.out.println(factorial(1));
        System.out.println(factorial(4));
        System.out.println(factorial(5));
        System.out.println(factorial(10));
    }

    // F(n) = F(1)*F(2)...F(n-1)*F(n)
    private static int factorial(int input) {
        int result = 1;
        for (int i = 1; i <= input; i++) {
            result *= i;
        }
        return result;
    }
}
