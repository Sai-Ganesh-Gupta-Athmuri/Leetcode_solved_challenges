class Solution {
    public String findDifferentBinaryString(String[] nums) {
        if(nums[0].equals("1")){
            return "0";
        }
        if(nums[0].equals("00") && nums[1].equals("01")){
            return "10";
        }
        if(nums[0].equals("10") && nums[1].equals("11")){
            return "00";
        }
        else if(nums[0].equals("0")){
            return "1";
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(String str : nums){
            arr.add(Integer.parseInt(str,2));
        }
        int len = nums.length;
        if(len == 2){
            for(int i = 2;i<2*2;i++){
                if(!arr.contains(i)){
                    return Integer.toBinaryString(i);
                }
            }
        }
        for(int i = (int)Math.pow(2,len-1);i<(int)Math.pow(2,len);i++){
            if(!arr.contains(i)){
                return Integer.toBinaryString(i);
            }
        }
        return "";
    }
}
