class Solution {
    public int longestConsecutive(int[] arr) {
        int n = arr.length;
        if(n == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr) set.add(i);
        int c = 0;
        for(Integer i : set){
            if(!set.contains(i-1)){
                int c1 = i+1;
                while(set.contains(c1)){
                    c1 += 1;
                }
                c = Math.max(c,c1 - i);
            }
        }
        return c;
    }
}
