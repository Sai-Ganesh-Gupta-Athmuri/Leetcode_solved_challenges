class Solution {
    public boolean closeStrings(String word1, String word2) {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for(int i = 0;i<word1.length();i++){
            arr1[word1.charAt(i) - 'a']++;
        }
        for(int i = 0;i<word2.length();i++){
            arr2[word2.charAt(i) - 'a']++;
        }
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for(int i = 0;i<26;i++){
            if(arr1[i]!=0 && arr2[i]!=0){
                a.add(arr1[i]);
                b.add(arr2[i]);
            }else if((arr1[i]!=0 && arr2[i] == 0) || (arr1[i] == 0 && arr2[i]!=0)){
                return false;
            }
        }
        Collections.sort(a);
        Collections.sort(b);
        return a.equals(b);
    }
}
