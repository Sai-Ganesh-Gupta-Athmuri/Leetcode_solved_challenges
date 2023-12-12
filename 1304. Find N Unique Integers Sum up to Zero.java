class Solution {
    public int[] sumZero(int n) {
        int z = 0,z1 = 0,k = 0;
        int[] arr = new int[n];
        if(n == 1){
            arr[0] = 0;
            return arr;
        }
        if(n%2 == 0){
            for(int i = 0;i<n/2;i++){
                z -= 1;
                arr[k] = z;
                k++;
            }
            for(int i = n/2;i<n;i++){
                z1+=1;
                arr[k] = z1;
                k++;
            }
            return arr;
        }else{
            for(int i = 0;i<n/2;i++){
                z -= 1;
                arr[k] = z;
                k++;
            }
            k=k+1;
            arr[k] = 0;
            for(int i = n/2+1;i<n;i++){
                z1+=1;
                arr[k] = z1;
                k++;
            }
            return arr;
        }
    }
}
