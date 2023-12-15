class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            if(map.containsKey(nums[i])){
                int f = map.get(nums[i]);
                map.put(nums[i],f+1);
            }else{
                map.put(nums[i],1);
            }
        }
        int pc = 0, rc = 0;
        for(Integer key : map.keySet()){
            pc += map.get(key)/2;
            rc += map.get(key)%2;
        }
        int[] arr = new int[2];
        arr[0] = pc;
        arr[1] = rc;
        return arr;
    }
}
