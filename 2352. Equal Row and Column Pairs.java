class Solution {
    public int equalPairs(int[][] grid) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        HashMap<ArrayList<Integer>, Integer> map = new HashMap<>();
        int r = grid.length;
        int c = grid[0].length;
        for(int i = 0;i<r;i++){
            ArrayList<Integer> arr = new ArrayList<>();
            for(int j = 0;j<c;j++){
                arr.add(grid[i][j]);
            }
            res.add(arr);
            if(map.containsKey(arr)) map.put(arr,map.get(arr)+1);
            else map.put(arr,1);
        }
        int count = 0;
        for(int i = 0;i<r;i++){
            ArrayList<Integer> arr = new ArrayList<>();
            for(int j = 0;j<c;j++){
                arr.add(grid[j][i]);
            }
            res.add(arr);
            if(map.containsKey(arr)){
                count+=map.get(arr);
            }
        }
        return count;
    }
}
