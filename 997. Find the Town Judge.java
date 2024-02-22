class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] res = new int[n];
        for(int i = 0;i<trust.length;i++){
            res[trust[i][0] - 1] --;
            res[trust[i][1] - 1] ++;
        }
        int n1 = res.length;
        for(int i = 0;i<n1;i++){
            if(res[i] == n-1) return i+1;
        }
        return -1;
    }
}
