class Solution {
    public String restoreString(String s, int[] indices) {
        String[] arr = new String[s.length()];
        String str = "";
        for(int i = 0;i<s.length();i++){
            arr[i] = s.substring(i,i+1);
        }
        int temp;
        String temp1;
        for(int i = 0;i<s.length();i++){
            for(int j = 0;j<s.length()-1;j++){
                if(indices[j]>indices[j+1]){
                    temp = indices[j];
                    indices[j] = indices[j+1];
                    indices[j+1] = temp;

                    temp1 = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp1;
                }
            }
        }
        for(int i = 0;i<s.length();i++){
            str+=arr[i];
        }
        return str;
    }
}
