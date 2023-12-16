class Solution {
    public String removeOuterParentheses(String s) {
        int ic = 0,oc = 0;
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        int index = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '('){
                ic++;
            }else{
                oc++;
            }
            if(ic == oc){
                map.put(index,i);
                index = i+1;
                ic = 0;
                oc = 0;
            }
        }
        String str = "";
        for(Integer key : map.keySet()){
            str += s.substring(key+1,map.get(key));
        }
        return str;
    }
}
