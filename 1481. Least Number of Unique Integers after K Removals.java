class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int i : arr){
            if(map.containsKey(i)) map.put(i,map.get(i)+1);
            else map.put(i,1);
        }
        int[] a = new int[map.size()];
        int j = 0;
        for(Integer i : map.keySet()){
            a[j] = map.get(i);
            j++;
        }
        Arrays.sort(a);
        if(k == 0 || a[0]>k){
            return a.length;
        }
        for(int i = 0;i<a.length;i++){
            if(k<=0) break;
            if(k>=a[i]){ 
                k = k - a[i];
            }else{
                break;
            }
            if(k>=0) a[i] = 0;
        }
        int c = 0;
        for(int i : a) {
            if(i != 0) c++;
        }
        return c;
    }
}
