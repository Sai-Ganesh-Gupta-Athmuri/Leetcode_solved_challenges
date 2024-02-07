//Brute Force Approach

class Solution {
    public String frequencySort(String s) {
        int[] arr = new int[26];
        int[] Arr = new int[26];
        int[] drr = new int[10];
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)>=97 && s.charAt(i)<=122) arr[s.charAt(i)-'a']++;
            else if(s.charAt(i)>=65 && s.charAt(i)<=90) Arr[s.charAt(i)-'A']++;
            else if(s.charAt(i)>=48 && s.charAt(i)<=57) drr[s.charAt(i)-'0']++;
        }
        long max = 0;
        for(int i : arr){
            if(max<i) max = i;
        }
        for(int i : Arr) if(max<i) max = i;
        for(int i : drr) if(max<i) max = i;
        String str = "";
        while(max>0){
            for(int i = 0;i<26;i++){
                if(Arr[i] == max) {
                    for(int j = 0;j<max;j++) str+=(char)('A'+i);
                }
            }
            for(int i = 0;i<26;i++){
                if(arr[i] == max) {
                    for(int j = 0;j<max;j++) str+=(char)('a'+i);
                }
            }
            for(int i = 0;i<10;i++){
                if(drr[i] == max) {
                    for(int j = 0;j<max;j++) str+=(char)('0'+i);
                }
            }
            max--;
        }
        return str;
    }
}
