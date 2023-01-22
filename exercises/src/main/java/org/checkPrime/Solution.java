package org.checkPrime;

public class Solution {
    public static void main(String[] args) {
        System.out.println("is 1 prime? " + checkPrime(1));
        System.out.println("is 1 prime? " + checkPrimeHalf(1));
        System.out.println("is 1 prime? " + checkPrimeSqrt(1));
        System.out.println("is 2 prime? " + checkPrime(2));
        System.out.println("is 2 prime? " + checkPrimeHalf(2));
        System.out.println("is 2 prime? " + checkPrimeSqrt(2));
        System.out.println("is 3 prime? " + checkPrime(3));
        System.out.println("is 3 prime? " + checkPrimeHalf(3));
        System.out.println("is 3 prime? " + checkPrimeSqrt(3));
        System.out.println("is 6 prime? " + checkPrime(6));
        System.out.println("is 6 prime? " + checkPrimeHalf(6));
        System.out.println("is 6 prime? " + checkPrimeSqrt(6));
        System.out.println("is 10 prime? " + checkPrime(10));
        System.out.println("is 10 prime? " + checkPrimeHalf(10));
        System.out.println("is 10 prime? " + checkPrimeSqrt(10));
        System.out.println("is 11 prime? " + checkPrime(11));
        System.out.println("is 11 prime? " + checkPrimeHalf(11));
        System.out.println("is 11 prime? " + checkPrimeSqrt(11));
        System.out.println("is 16 prime? " + checkPrime(16));
        System.out.println("is 16 prime? " + checkPrimeHalf(16));
        System.out.println("is 16 prime? " + checkPrimeSqrt(16));
        System.out.println("is 17 prime? " + checkPrime(17));
        System.out.println("is 17 prime? " + checkPrimeHalf(17));
        System.out.println("is 17 prime? " + checkPrimeSqrt(17));
        System.out.println("is 73 prime? " + checkPrime(73));
        System.out.println("is 73 prime? " + checkPrimeHalf(73));
        System.out.println("is 73 prime? " + checkPrimeSqrt(73));
        System.out.println("is 74 prime? " + checkPrime(74));
        System.out.println("is 74 prime? " + checkPrimeHalf(74));
        System.out.println("is 74 prime? " + checkPrimeSqrt(74));
    }

    private static boolean checkPrime(Integer n) {
        if (n == null) return false;
        if (n < 2) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    private static boolean checkPrimeHalf(Integer n) {
        if (n == null) return false;
        if (n < 2) return false;
        int half = n / 2;
        for (int i = 2; i <= half; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    private static boolean checkPrimeSqrt(Integer n) {
        if (n == null) return false;
        if (n < 2) return false;
        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

}
