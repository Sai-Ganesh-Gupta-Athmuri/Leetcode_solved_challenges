class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> one = new HashMap<>();
        HashMap<String,Integer> two = new HashMap<>();
        int c = 0;
        for(String word : words1){
            if(one.containsKey(word)){
                int frequency = one.get(word);
                one.put(word,frequency+1);
            }else{
                one.put(word,1);
            }
        }
        for(String word : words2){
            if(two.containsKey(word)){
                int frequency = two.get(word);
                two.put(word,frequency+1);
            }else{
                two.put(word,1);
            }
        }
        for(String word : words1){
            if(one.containsKey(word) && two.containsKey(word) && one.get(word)==1 &&  two.get(word)==1){
                c+=1;
            }
        }
        return c;
    }
}
