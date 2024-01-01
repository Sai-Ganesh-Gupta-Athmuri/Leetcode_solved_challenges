class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet();
        int max = 0;
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            while(!set.add(s.charAt(i))) {
                set.remove(s.charAt(j++));
            }
            max = Math.max(max, i - j + 1);
        }
        return max;
    }
}
