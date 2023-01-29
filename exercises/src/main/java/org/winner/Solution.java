package org.winner;

import java.io.*;
import java.util.function.Function;


class Result {

    /*
     * Complete the 'winner' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING erica
     *  2. STRING bob
     */

    public static String winner(String erica, String bob) {
        Function<String, Integer> total = player -> {
            Integer score = 0;
            for (char c : player.toCharArray()) {
                score += pointsPerChar(c);
            }
            return score;
        };
        Integer ericaScore = total.apply(erica);
        Integer bobScore = total.apply(bob);


        if (ericaScore > bobScore) return "Erica";
        if (ericaScore < bobScore) return "Bob";
        return "Tie";
    }


    private static Integer pointsPerChar(char c) {
        switch (c) {
            case 'E':
                return 1;
            case 'M':
                return 3;
            case 'H':
                return 5;
            default:
                return null;
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String erica = bufferedReader.readLine();

        String bob = bufferedReader.readLine();

        String result = Result.winner(erica, bob);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
