class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int l1 = text1.length();
        int l2 = text2.length();
        int[][] arr = new int[l1+1][l2+1];
        for(int i = 0;i<=l1;i++){
            for(int j = 0;j<=l2;j++){
                if(i == 0 || j == 0) arr[i][j] = 0;
                else if(text1.charAt(i-1) == text2.charAt(j-1)) arr[i][j] = arr[i-1][j-1]+1;
                else arr[i][j] = Math.max(arr[i-1][j],arr[i][j-1]);
            }
        }
        return arr[l1][l2];
    }
}
