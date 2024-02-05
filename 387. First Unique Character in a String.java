class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for(int i = 0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))) map.put(s.charAt(i),-1);
            else map.put(s.charAt(i),i);
        }
        for(Character ch : map.keySet()) {
            if(map.get(ch) != -1) return map.get(ch);
        }
        return -1;
    }
}
