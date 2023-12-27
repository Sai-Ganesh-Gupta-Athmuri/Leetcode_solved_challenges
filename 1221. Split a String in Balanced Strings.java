class Solution {
    public int balancedStringSplit(String s) {
        int rcount = 0,lcount = 0;
        int count = 0;
        for(int i = 0;i < s.length();i++){
            if(s.substring(i,i+1).equals("R")){
                rcount+=1;
            }
            if(s.substring(i,i+1).equals("L")){
                lcount+=1;
            }
            if(rcount == lcount){
                count+=1;
                rcount = 0;
                lcount = 0;
            }
        }
        return count;
    }
}
