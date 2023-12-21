class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        HashSet<Integer> set1 = new HashSet<>();
        for(int[] arr: points){
            set1.add(arr[0]);
        }
        Integer[] set2 = set1.toArray(new Integer[0]);
        Arrays.sort(set2);
        int max = 0;
        for(int i = 1;i<set2.length;i++){
            max = Math.max(max,set2[i] - set2[i-1]);
        }
        return max;
    }
}
