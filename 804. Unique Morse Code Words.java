class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        if(words.length<=1){
            return words.length;
        }
        String[] codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] result = new String[words.length];
        String str = "";
        for(int i = 0;i<words.length;i++){
            str = "";
            for(int j = 0;j<words[i].length();j++){
                char ch = words[i].charAt(j);
                int val = ch;
                str+=codes[ch-97];
            }
            result[i] = str;
        }
        Set<String> set = new HashSet<>(Arrays.asList(result));
        int c = set.size();
        return c;
    }
}
