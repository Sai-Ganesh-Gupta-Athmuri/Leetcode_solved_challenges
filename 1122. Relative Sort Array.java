class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<arr1.length;i++){
            if(map.containsKey(arr1[i])){
                int f = map.get(arr1[i]);
                map.put(arr1[i],f+1);
            }else{
                map.put(arr1[i],1);
            }
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < arr2.length; i++){
            for(int j = 0;j<map.get(arr2[i]);j++){
                arr.add(arr2[i]);
            }
        }
        ArrayList<Integer> arr3 = new ArrayList<>();
        for(int i = 0;i<arr1.length;i++){
            if(arr.contains(arr1[i])){
                continue;
            }else{
                arr3.add(arr1[i]);
            }
        }
        Collections.sort(arr3);
        for(int i = 0;i<arr3.size();i++){
            arr.add(arr3.get(i));
        }
        for(int i = 0;i<arr.size();i++){
            arr1[i] = arr.get(i);
        }
        return arr1;
    }
}
