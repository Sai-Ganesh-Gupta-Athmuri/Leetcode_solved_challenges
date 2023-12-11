class Solution {
    public int mostWordsFound(String[] sentences) {
        int[] arr = new int[sentences.length];
        int space = 1;
        for(int i = 0;i<sentences.length;i++){
            space = 1;
            String s = sentences[i];
            for(int j = 0;j<s.length();j++){
                if(s.charAt(j) == ' '){
                    space+=1;
                }
            }
            arr[i] = space;
        }
        int max = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
