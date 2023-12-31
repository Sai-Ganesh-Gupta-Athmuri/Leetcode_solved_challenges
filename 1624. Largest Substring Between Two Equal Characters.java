class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int len = 0;
        int n = s.length();
        if(n<=1){
            return -1;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(s.charAt(i) == s.charAt(j)){
                    map.put(i,j-1);
                }
            }
        }
        if(map.isEmpty()) return -1;
        else{
            for(Integer i : map.keySet()){
                len = Math.max(len,Math.abs(i-map.get(i)));
            }
        }
        return len;
    }
}
