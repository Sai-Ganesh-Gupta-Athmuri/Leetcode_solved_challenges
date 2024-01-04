class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(nums[i])) map.put(nums[i],map.get(nums[i])+1);
            else map.put(nums[i],1);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(Integer i : map.keySet()){
            res.add(map.get(i));
        }
        if(res.contains(1)) return -1;
        int c = 0;
        for(Integer i : res){
            if(i%3 == 0) c+=i/3;
            else{
                while(i-3>1){
                    i -= 3;
                    c++;
                }
                while(i>0){
                    i-=2;
                    c++;
                }
            }
        }
        return c;
    }
}
