class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> arr = new ArrayList<>();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U' || s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                arr.add(s.charAt(i));
            }
        }
        Collections.sort(arr);
        String str = "";
        int k = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U' || s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                str += arr.get(k)+"";
                k++;
            }else{
                str += s.charAt(i)+"";
            }
        }
        return str;
    }
}
