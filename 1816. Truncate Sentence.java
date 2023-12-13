class Solution {
    public String truncateSentence(String s, int k) {
        String str = "";
        int m = 0,j =0;
        int c= 0;
        for(int i = 0;i<s.length()-1;i++){
            if(c<=k){
                if(s.substring(i,i+1) == " "){
                    str+=s.substring(m,i+1);
                    m = i+1;
                    c+=1;
                }
            }
        }
        return str;
    }
}
