class Solution {
    public boolean isPathCrossing(String s) {
        int xc = 0,yc = 0;
        HashSet<Pair<Integer,Integer>> set = new HashSet<>();
        set.add(new Pair(xc,yc));
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == 'N'){
                yc++;
                Pair current = new Pair(xc,yc);
                if(set.contains(current)){
                    return true;
                }
                set.add(current);
            }
            if(s.charAt(i) == 'S'){
                yc--;
                Pair current = new Pair(xc,yc);
                if(set.contains(current)){
                    return true;
                }
                set.add(current);
            }
            if(s.charAt(i) == 'E'){
                xc++;
                Pair current = new Pair(xc,yc);
                if(set.contains(current)){
                    return true;
                }
                set.add(current);
            }
            if(s.charAt(i) == 'W'){
                xc--;
                Pair current = new Pair(xc,yc);
                if(set.contains(current)){
                    return true;
                }
                set.add(current);
            }
        }
        return false;
    }
}
