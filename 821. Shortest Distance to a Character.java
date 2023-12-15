class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] arr = new int[s.length()];
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == c){
                res.add(i);
            }
        }
        int min = res.get(0);
        for(int i = 0;i<s.length();i++){
            for(int j = 0;j<res.size();j++){
                if(Math.abs(i - min)>Math.abs(i-res.get(j))){
                    min = res.get(j);
                }
            }
            arr[i] = Math.abs(i-min);
        }
        return arr;
    }
}
