class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len = Integer.MAX_VALUE;;
        for(int i = 0;i<strs.length;i++){
            if(len>strs[i].length()){
                len = strs[i].length();
            }
        }
        String str = "";
        int n = len;
        for(int i = 0;i<n;i++){
            int c = 0;
            for(int j = 0;j<strs.length-1;j++){
                if(strs[j].substring(0,len).equals(strs[j+1].substring(0,len))){
                    c++;
                }
            }
            if(c == strs.length-1){
                str += strs[0].substring(0,len);
                break;
            }
            len--;
        }
        return str;
    }
}
