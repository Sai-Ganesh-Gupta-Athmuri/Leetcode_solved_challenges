class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int c = 0;
        for(int j = left;j<=right;j++){
            if(vowel(words[j].charAt(0)) && vowel(words[j].charAt(words[j].length()-1))){
                c+=1;
            }
        }
        return c;
    }
    public boolean vowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }else{
            return false;
        }
    }
}
