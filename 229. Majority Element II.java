class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums) {
            if(map.containsKey(i)) map.put(i,map.get(i)+1);
            else map.put(i,1);
        }
        List<Integer> arr = new ArrayList<>();
        for(Integer i : map.keySet()){
            if(map.get(i) > nums.length/3) arr.add(i);
        }
        return arr;
    }
}
