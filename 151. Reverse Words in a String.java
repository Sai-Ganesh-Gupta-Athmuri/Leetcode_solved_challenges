class Solution {
    public String reverseWords(String s) {
        s = s.strip();
        int k = 0;
        int j = 0;
        ArrayList<String> arr = new ArrayList<>();
        while (j < s.length()) {
            if (s.charAt(j) == ' ') {
                String dup = s.substring(k, j).strip();
                if (!dup.isEmpty()) {
                    arr.add(dup);
                }
                k = j + 1;
            }
            j++;
        }
        arr.add(s.substring(k, j).strip());
        StringBuilder str = new StringBuilder();
        for (int i = arr.size() - 1; i >= 0; i--) {
            if (!arr.get(i).isEmpty()) {
                str.append(arr.get(i));
                if (i != 0) {
                    str.append(" ");
                }
            }
        }
        return str.toString();
    }
}
