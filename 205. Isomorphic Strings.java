class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> m1 = new HashMap<>();
        HashMap<Character, Character> m2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            if (m1.containsKey(charS)) {
                if (m1.get(charS) != charT) {
                    return false; 
                }
            } else {
                m1.put(charS, charT);
            }
            if (m2.containsKey(charT)) {
                if (m2.get(charT) != charS) {
                    return false;
                }
            } else {
                m2.put(charT, charS);
            }
        }
        return true;
    }
}
