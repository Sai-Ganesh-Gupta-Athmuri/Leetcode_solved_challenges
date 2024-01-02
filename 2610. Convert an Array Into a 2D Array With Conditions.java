class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        
        List<List<Integer>> arr = new ArrayList<>();
        
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }

        int max = 0;

        for(Integer i : map.keySet()){
            max = Math.max(max,map.get(i));
        }

        while(max > 0){
            ArrayList<Integer> a = new ArrayList<>();
            for(Integer i : map.keySet()){
                if(map.get(i)>0) a.add(i);
                if(map.containsKey(i)) map.put(i,map.get(i)-1);
            }
            arr.add(a);
            max--;
        }
        return arr;
    }
}
