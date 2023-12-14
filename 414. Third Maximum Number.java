class Solution {
    public int thirdMax(int[] nums) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int i = 0;i<nums.length;i++){
            set.add(nums[i]);
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        if(list.size()==2){
            return list.get(1);
        }
        if(list.size()==1){
            return list.get(0);
        }else{
            return list.get(list.size()-3);
        }
    }
}
