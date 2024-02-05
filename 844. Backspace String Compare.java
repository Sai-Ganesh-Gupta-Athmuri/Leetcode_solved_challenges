class Solution {
    public boolean backspaceCompare(String s, String t) {
        int n1 = s.length(), n2 = t.length();
        String str1 = findFinalString(s);
        String str2 = findFinalString(t);
        return str1.equals(str2);
    }
    private String findFinalString(String str) {
        int n = str.length();
        int c = 0;
        StringBuilder res = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            if (str.charAt(i) == '#') {
                c++;
            } else {
                if (c > 0) {
                    c--;
                } else {
                    res.append(str.charAt(i));
                }
            }
        }
        return res.reverse().toString();
    }
}
