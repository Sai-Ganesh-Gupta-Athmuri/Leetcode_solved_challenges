class Solution {
    public int minCostToMoveChips(int[] position) {
        int oc = 0,ec = 0;
        for(int i = 0;i < position.length;i++){
            if(position[i]%2 == 0){
                ec +=1;
            }else{
                oc+=1;
            }
        }
        return Math.min(oc,ec);
    }
}
