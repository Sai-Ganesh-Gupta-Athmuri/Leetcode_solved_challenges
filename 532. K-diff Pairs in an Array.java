class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        int c = 0;
        for(Integer i : map.keySet()){
            if(map.containsKey(i+k)){
                if(map.get(i) == 1 && k == 0) continue;
                else c++;
            }
        }
        return c;
    }
}
