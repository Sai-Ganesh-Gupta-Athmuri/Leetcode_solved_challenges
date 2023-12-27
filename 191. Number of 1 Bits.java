public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String str = Integer.toBinaryString(n);
        int c = 0;
        System.out.println(str);
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == '1'){
                c++;
            }
        }
        return c;
    }
}
