package org.binarySearch;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        int toBeSearched = 1;
        System.out.println("Found " + toBeSearched + " ?");
        System.out.println(binarySearch(toBeSearched, array, 0, array.length - 1));
        System.out.println(binarySearchRecursive(toBeSearched, array, 0, array.length - 1));
        toBeSearched = 2;
        System.out.println("Found " + toBeSearched + " ?");
        System.out.println(binarySearch(toBeSearched, array, 0, array.length - 1));
        System.out.println(binarySearchRecursive(toBeSearched, array, 0, array.length - 1));
        toBeSearched = 3;
        System.out.println("Found " + toBeSearched + " ?");
        System.out.println(binarySearch(toBeSearched, array, 0, array.length - 1));
        System.out.println(binarySearchRecursive(toBeSearched, array, 0, array.length - 1));
        toBeSearched = 4;
        System.out.println("Found " + toBeSearched + " ?");
        System.out.println(binarySearch(toBeSearched, array, 0, array.length - 1));
        System.out.println(binarySearchRecursive(toBeSearched, array, 0, array.length - 1));
        toBeSearched = 5;
        System.out.println("Found " + toBeSearched + " ?");
        System.out.println(binarySearch(toBeSearched, array, 0, array.length - 1));
        System.out.println(binarySearchRecursive(toBeSearched, array, 0, array.length - 1));
        toBeSearched = 6;
        System.out.println("Found " + toBeSearched + " ?");
        System.out.println(binarySearch(toBeSearched, array, 0, array.length - 1));
        System.out.println(binarySearchRecursive(toBeSearched, array, 0, array.length - 1));
        toBeSearched = 7;
        System.out.println("Found " + toBeSearched + " ?");
        System.out.println(binarySearch(toBeSearched, array, 0, array.length - 1));
        System.out.println(binarySearchRecursive(toBeSearched, array, 0, array.length - 1));
        toBeSearched = 8;
        System.out.println("Found " + toBeSearched + " ?");
        System.out.println(binarySearch(toBeSearched, array, 0, array.length - 1));
        System.out.println(binarySearchRecursive(toBeSearched, array, 0, array.length - 1));
        toBeSearched = 9;
        System.out.println("Found " + toBeSearched + " ?");
        System.out.println(binarySearch(toBeSearched, array, 0, array.length - 1));
        System.out.println(binarySearchRecursive(toBeSearched, array, 0, array.length - 1));
        toBeSearched = 10;
        System.out.println("Found " + toBeSearched + " ?");
        System.out.println(binarySearch(toBeSearched, array, 0, array.length - 1));
        System.out.println(binarySearchRecursive(toBeSearched, array, 0, array.length - 1));
        toBeSearched = 11;
        System.out.println("Found " + toBeSearched + " ?");
        System.out.println(binarySearch(toBeSearched, array, 0, array.length - 1));
        System.out.println(binarySearchRecursive(toBeSearched, array, 0, array.length - 1));
        toBeSearched = 0;
        System.out.println("Found " + toBeSearched + " ?");
        System.out.println(binarySearch(toBeSearched, array, 0, array.length - 1));
        System.out.println(binarySearchRecursive(toBeSearched, array, 0, array.length - 1));
    }

    private static boolean binarySearch(int toBeSearched, int[] array, int low, int high) {
        while (low != high){
            int mid = (low + high) / 2;
            int midValue = array[mid];
            if (midValue == toBeSearched) {
                return true;
            } else if (toBeSearched < midValue) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return array[low] == toBeSearched;
    }

    private static boolean binarySearchRecursive(int toBeSearched, int[] array, int low, int high) {
        if (low > high) return false;
        int mid = (low + high) / 2;
        if (array[mid] == toBeSearched) {
            return true;
        } else if (toBeSearched < array[mid]) {
            return binarySearchRecursive(toBeSearched, array, low, mid - 1);
        } else {
            return binarySearchRecursive(toBeSearched, array, mid + 1, high);
        }
    }
}
