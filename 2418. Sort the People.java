class Solution {
    public String[] sortPeople(String[] words, int[] heights) {
        int temp;
        String temp1;
        for(int i = 0;i<heights.length;i++){
            for(int j = 0;j<heights.length-1;j++){
                if(heights[j]<heights[j+1]){
                    temp = heights[j];
                    heights[j] = heights[j+1];
                    heights[j+1] = temp;

                    temp1 = words[j];
                    words[j] = words[j+1];
                    words[j+1] = temp1;
                }
            }
        }
        return words;
    }
}
