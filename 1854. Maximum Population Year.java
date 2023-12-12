class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] arr = new int[101];
        for(int[] a : logs){
            arr[a[0]-1950] += 1;
            arr[a[1]-1950] -= 1;
        }
        int c = 0, g = 0,y = 0;
        for(int i = 0;i<arr.length;i++){
            c+=arr[i];
            if(c > g){
                g = c;
                y = i;
            }
        }
        return y+1950;
    }
}
