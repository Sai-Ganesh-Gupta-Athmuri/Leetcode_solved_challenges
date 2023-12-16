class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> map =new HashMap<>();
        int ch = 97;
        map.put(' ',' ');
        for(int i = 0;i<key.length();i++){
            if(!map.containsKey(key.charAt(i))){
                map.put(key.charAt(i),(char)ch);
                ch++;
            }
        }
        String str = "";
        for(int i = 0;i<message.length();i++){
            str += map.get(message.charAt(i));
        }
        return str;
    }
}
