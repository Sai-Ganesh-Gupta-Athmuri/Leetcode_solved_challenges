class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] arr = new int[mat.length];
        int[] arr1 = new int[mat.length];
        int[] arr2 = new int[k];
        for(int i = 0;i<mat.length;i++){
            int c = 0;
            for(int j = 0;j<mat[0].length;j++){
                if(mat[i][j] == 1) c++;
            }
            arr[i] = c;
            arr1[i] = i;
        }
        int temp;
        for(int i = 0;i<arr.length-1;i++){
            for(int j = 0;j<arr.length - i - 1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = temp;

                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i = 0;i<k;i++){
            arr2[i] = arr1[i];
        }
        return arr2;
    }
}
