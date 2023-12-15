import java.util.*;
class Solution {
    public int[] replaceElements(int[] arr) {
        int[] a = new int[arr.length];
        for(int i = 0;i<arr.length-1;i++){
            a[i] = getmax(Arrays.copyOfRange(arr,i+1,arr.length));
        }
        a[arr.length-1] = -1;
        return a;
    }
    public int getmax(int[] a){
        int max = a[0];
        for(int i = 0;i<a.length;i++){
            if(max<a[i]){
                max = a[i];
            }
        }
        return max;
    }
}
