package com.Arraypractice;

import java.util.*;

class CombinationIterator {

    List<String> combinations = new ArrayList<>();
    int index = 0;

    public CombinationIterator(String characters, int combinationLength) {
        generate(characters, combinationLength, 0, "");
    }

    private void generate(String characters, int length, int start, String current) {

        if (current.length() == length) {
            combinations.add(current);
            return;
        }

        for (int i = start; i < characters.length(); i++) {
            generate(
                characters,
                length,
                i + 1,
                current + characters.charAt(i)
            );
        }
    }

    public String next() {
        return combinations.get(index++);
    }

    public boolean hasNext() {
        return index < combinations.size();
    }
}
