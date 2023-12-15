class Solution {
    public int countPrefixes(String[] words, String s) {
        int c =0;
        for(int i = 0;i<words.length;i++){
            if(words[i].length()<s.length() && words[i].equals(s.substring(0,words[i].length()))){
                c++;
            }else if(words[i].length() == s.length() && words[i].equals(s)){
                c++;
            }else if(words[i].length()>s.length() && words[i].substring(0,s.length()).equals(s)){
                continue;
            }
        }
        return c;
    }
}
