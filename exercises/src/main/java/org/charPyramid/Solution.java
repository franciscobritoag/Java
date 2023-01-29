package org.charPyramid;

public class Solution {

    public static void main(String[] args) {
        drawPyramid(3);
    }

    /**

         *
       * * *
     * * * * *

     */
    private static void drawPyramid(int levels) {
        int stars = 1;
        int spaces = levels - 1;

        for (int i = 0; i < levels; i++) {

            // spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print("\t");
            }

            // stars
            for (int k = 0; k < stars; k++) {
                System.out.print("*\t");
            }

            stars+=2;
            spaces --;
            System.out.println();
        }
    }

}
