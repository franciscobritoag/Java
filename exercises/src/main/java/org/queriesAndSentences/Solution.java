package org.queriesAndSentences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        List<String> sentences = new ArrayList<>();
        List<String> queries = new ArrayList<>();

        sentences.add("it go will away");
        sentences.add("go do art");
        sentences.add("what to will east");

        queries.add("it will");
        queries.add("go east will");
        queries.add("will");

        System.out.println(textQueries(sentences, queries));
    }

    /**
     3
     it go will away
     go do art
     what to will east
     3
     it will
     go east will
     will
     [[0, 2],[-1][0, 2]]
     */
    public static List<List<Integer>> textQueries(List<String> sentences, List<String> queries) {
        List<List<Integer>> result = new ArrayList<>();

        queries.forEach(q -> {
            List<String> wordsFromQuery = Arrays.asList(q.split(" "));
            List<Integer> indexesByQuery = new ArrayList<>();
            for (int i = 0; i < sentences.size(); i++) {
                if (containsAllMyWords(sentences.get(i), wordsFromQuery)) {
                    indexesByQuery.add(i);
                }
            }
            if (indexesByQuery.isEmpty()) indexesByQuery.add(-1);
            result.add(indexesByQuery);
        });

        return result;
    }

    private static boolean containsAllMyWords(String sentence, List<String> wordsFromQuery) {
        return wordsFromQuery.stream().allMatch(w -> sentence.contains(w));
    }

}
