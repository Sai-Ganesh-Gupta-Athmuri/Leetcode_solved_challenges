class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int c1 = 0;
        for(int i = 0;c1<g.length && i<s.length;i++){
            if(s[i]>=g[c1]) c1++;
        }
        return c1;
    }
}
