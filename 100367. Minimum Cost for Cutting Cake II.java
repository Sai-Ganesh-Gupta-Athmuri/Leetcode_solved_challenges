class Solution {
    public long minimumCost(int m, int n, int[] horizontalCut, int[] verticalCut) {
        Arrays.sort(horizontalCut);
        Arrays.sort(verticalCut);
        int idx1 = m - 2;
        int idx2 = n - 2;
        int hc = 1,vc = 1;
        long cost = 0;
        while(idx1>= 0 && idx2 >= 0){
            if(horizontalCut[idx1] >= verticalCut[idx2]){
                cost += horizontalCut[idx1] * vc;
                idx1--;
                hc++;
            }else{
                cost += verticalCut[idx2] * hc;
                idx2--;
                vc++;
            }
        }
        while(idx1 >= 0){
            cost += horizontalCut[idx1] * vc;
            idx1--;
            hc++;
        }
        while(idx2 >= 0){
            cost += verticalCut[idx2] * hc;
            idx2--;
            vc++;
        }
        return cost;
    }
}
