class Solution {
    public int maxDepth(String s) {
        int max = 0;
        int ic = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '('){
                ic++;
            }else if(s.charAt(i) == ')'){
                ic--;
            }
            if(ic>max){
                max = ic;
            }
        }
        return max;
    }
}
