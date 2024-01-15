class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        for(int i = 0;i<matches.length;i++){
            if(map1.containsKey(matches[i][0])){
                map1.put(matches[i][0],map1.get(matches[i][0])+1);
            }else{
                map1.put(matches[i][0],1);
            }
        }
        for(int i = 0;i<matches.length;i++){
            if(map2.containsKey(matches[i][1])){
                map2.put(matches[i][1],map2.get(matches[i][1])+1);
            }else{
                map2.put(matches[i][1],1);
            }
        }
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        List<Integer> two = new ArrayList<>();
        for(Integer i : map1.keySet()){
            if(map1.containsKey(i) && !map2.containsKey(i)) one.add(i);
        }
        for(Integer i : map2.keySet()){
            if(map2.get(i)>=1 && map2.get(i) == 1) two.add(i);
        }
        Collections.sort(one);
        Collections.sort(two);
        arr.add(one);
        arr.add(two);
        return arr;        
    }
}
