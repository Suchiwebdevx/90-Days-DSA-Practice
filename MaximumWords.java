package com.Pattern;

public class MaximumWords {

    public static void main(String[] args) {

        String[] sentences = {
            "alice and bob love leetcode",
            "i think so too",
            "this is great thanks very much"
        };

        int max = 0;

        for (String sentence : sentences) {

            int count = 1;

            for (int i = 0; i < sentence.length(); i++) {

                if (sentence.charAt(i) == ' ') {
                    count++;
                }
            }

            if (count > max) {
                max = count;
            }
        }

        System.out.println("Maximum words: " + max);
    }
}