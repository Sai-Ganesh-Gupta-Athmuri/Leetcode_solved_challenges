class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int it = 0;
        if(ruleKey.equals("type"))
            it = 0;
        if(ruleKey.equals("color"))
            it = 1;
        if(ruleKey.equals("name"))
            it = 2;
        int c = 0;
        for (int i = 0;i<items.size();i++){
            if(items.get(i).get(it).equals(ruleValue))
                c+=1;
        }
        return c;
    }
}
