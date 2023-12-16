class Solution {
    public String maximumOddBinaryNumber(String s) {
        int zc = 0, oc = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                oc+=1;
            }else{
                zc+=1;
            }
        }
        if(oc == 0){
            return s;
        }
        StringBuilder sb = new StringBuilder("1");
        for(int i = 0;i<zc;i++){
            sb.append("0");
        }
        for(int i = 0;i<oc-1;i++){
            sb.append("1");
        }
        return sb.reverse().toString();

    }
}
