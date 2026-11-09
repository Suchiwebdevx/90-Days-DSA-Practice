import java.util.HashMap;

class Solution {
    public boolean canConstruct(String rn, String mg) {
        HashMap<Character, Integer> m = new HashMap<>();

        for (char c : mg.toCharArray()) {
            m.put(c, m.getOrDefault(c, 0) + 1);
        }

        for (char c : rn.toCharArray()) {
            if (m.containsKey(c) && m.get(c) > 0) {
                m.put(c, m.get(c) - 1);
            } else {
                return false;
            }
        }

        return true;
    }
}
