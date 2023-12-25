class Solution {
    public int myAtoi(String s) {
        s = s.strip();
        int sign = 1;
        if(s.length() == 0) return 0;
        if(s.charAt(0) == '-'){
            sign = -1;
        }
        int sum = 0;
        for(int i = 0;i<s.length();i++){
            if((i==0 && sign == -1 )|| (i==0 && s.charAt(i) == '+')){
                continue;
            }
            int d = s.charAt(i)-'0';
            if(d<0 || d>9) break;
            if(sum > Integer.MAX_VALUE/10 && sign == 1) return Integer.MAX_VALUE;
            if(sum > Integer.MAX_VALUE/10 && sign == -1) return Integer.MIN_VALUE;
            if(sum == Integer.MAX_VALUE/10 && d>7){
                if(sign == 1){
                    return Integer.MAX_VALUE;
                }return Integer.MIN_VALUE;
            }
            if(d>=0 && d<=9) sum = sum * 10 + d;
            else break;
            
        }
        return sum*sign;
    }
}
