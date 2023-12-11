class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> arr = new ArrayList<>();
        String str = String.valueOf(x);
        for(int i = 0;i<words.length;i++){
            if(words[i].contains(str)){
                arr.add(i);
            }
        }
        return arr;
    }
}
