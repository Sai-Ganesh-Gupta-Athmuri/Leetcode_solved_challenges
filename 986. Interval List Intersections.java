class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        if(firstList.length==0 || secondList.length==0) return new int[0][0];
        int i = 0;
        int j = 0;
        int max = 0, min = 0;
        List<int[]> ans = new ArrayList<>();
        while(i<firstList.length && j<secondList.length){
            max = Math.max(firstList[i][0],secondList[j][0]);
            min = Math.min(firstList[i][1],secondList[j][1]);
			      if(min>=max){           
                ans.add(new int[]{max,min});
            }           
            if(min == firstList[i][1]) i++;       
            if(min == secondList[j][1]) j++;
        }
        return ans.toArray(new int[ans.size()][2]);
    }
}
