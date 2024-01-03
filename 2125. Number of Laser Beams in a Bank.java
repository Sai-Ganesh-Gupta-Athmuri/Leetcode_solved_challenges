class Solution {
    public int numberOfBeams(String[] bank) {
        int[] arr = new int[bank.length];
        for(int i = 0;i<bank.length;i++){
            arr[i] = setBitCount(bank[i]);
        }
        int res = 0;
        int prev = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i]!=0){
                res += prev*arr[i];
                prev = arr[i];
            }
        }
        return res;
    }
    public int setBitCount(String str){
        int c = 0;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == '1'){
                c++;
            }
        }
        return c;
    }
}
