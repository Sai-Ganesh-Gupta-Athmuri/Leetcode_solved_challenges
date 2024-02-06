class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, Integer> map = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String s = new String(chars);
            if (map.containsKey(s)) {
                res.get(map.get(s)).add(str);
            } else {
                map.put(s, res.size());
                List<String> arr = new ArrayList<>(Arrays.asList(str));
                res.add(arr);
            }
        }
        return res;
    }
}
