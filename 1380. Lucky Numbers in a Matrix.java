import java.util.*;
class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        int min = 0,max = 0,temp;
        if(matrix.length==1){
            for(int i = 0;i<matrix.length;i++){
                min = mini(matrix[i]);
                arr.add(min);
            }
            return arr;
        }
        if(matrix[0].length==1){
            int[][] transpose = new int[matrix[0].length][matrix.length];
            for(int i = 0;i<matrix[0].length;i++){
                for(int j = 0;j<matrix.length;j++){
                    transpose[i][j] = matrix[j][i];
                }
            }
            for(int i = 0;i<transpose.length;i++){
                max = maxi(transpose[i]);
                arr.add(max);
            }
            return arr;
        }
        for(int i = 0;i<matrix.length;i++){
            min = mini(matrix[i]);
            arr.add(min);
        }
        int[][] transpose = new int[matrix[0].length][matrix.length];
        for(int i = 0;i<matrix[0].length;i++){
            for(int j = 0;j<matrix.length;j++){
                transpose[i][j] = matrix[j][i];
            }
        }
        for(int i = 0;i<transpose.length;i++){
            max = maxi(transpose[i]);
            arr.add(max);
        }
        Integer[] Arr = arr.toArray(new Integer[arr.size()]);
        Arrays.sort(Arr);
        for(int i =0;i<Arr.length-1;i++){
            if(Arr[i].equals(Arr[i+1])){
                arr1.add(Arr[i]);
            }
        }
        return arr1;
    }
    public int mini(int[] arr){
        int min = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }return min;
    }
    public int maxi(int[] arr){
        int max = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }return max;
    }
}
