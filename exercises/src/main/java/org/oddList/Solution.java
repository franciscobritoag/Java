package org.oddList;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(containsOnlyOddNumbers(Arrays.asList(1,2,3,4,5)));
        System.out.println(containsOnlyOddNumbers2(Arrays.asList(1,2,3,4,5)));
        System.out.println(containsOnlyOddNumbers3(Arrays.asList(1,2,3,4,5)));
        System.out.println(containsOnlyOddNumbers(Arrays.asList(2,4,6,8)));
        System.out.println(containsOnlyOddNumbers2(Arrays.asList(2,4,6,8)));
        System.out.println(containsOnlyOddNumbers3(Arrays.asList(2,4,6,8)));
        System.out.println(containsOnlyOddNumbers(Arrays.asList(2,4,6,8,9)));
        System.out.println(containsOnlyOddNumbers2(Arrays.asList(2,4,6,8,9)));
        System.out.println(containsOnlyOddNumbers3(Arrays.asList(2,4,6,8,9)));
    }

    private static boolean containsOnlyOddNumbers(List<Integer> list) {
        for (Integer i : list) {
            if (i % 2 != 0) return false;
        }
        return true;
    }

    private static boolean containsOnlyOddNumbers2(List<Integer> list) {
        return list.stream().allMatch(i -> i % 2 == 0);
    }

    private static boolean containsOnlyOddNumbers3(List<Integer> list) {
        return list.stream().filter(i -> i % 2 != 0).findAny().isEmpty();
    }
}
