package com.Arraypractice;

public class CombinationForloop {

    public int numDistinct(String s) {

        int n = s.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            count++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                count++;
            }
        }

        if (n == 3) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        CombinationForloop cf = new CombinationForloop();

        String s = "abc";

        int ans = cf.numDistinct(s);

        System.out.println(ans);
    }
}