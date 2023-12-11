class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        for(int i = 0;i<candies.length;i++){
            if(max<candies[i]){
                max = candies[i];
            }
        }
        ArrayList<Boolean> lst = new ArrayList<>();
        for(int i = 0;i<candies.length;i++){
            if(candies[i] + extraCandies >= max){
                lst.add(true);
            }else{
                lst.add(false);
            }
        }
        return lst;
    }
}
