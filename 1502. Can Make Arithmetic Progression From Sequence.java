class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        if(arr.length == 1){
            return true;
        }else{
            boolean check = false;
            int diff = Math.abs(arr[0] - arr[1]);
            for(int i = 1;i < arr.length;i++){
                if(Math.abs(arr[i]-arr[i-1]) == diff){
                    check = true;
                }
                if(Math.abs(arr[i]-arr[i-1]) != diff){
                    return false;
                }
            }
            return check == true;
        }    
    }
}
