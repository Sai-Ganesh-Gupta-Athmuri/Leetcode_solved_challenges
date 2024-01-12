class Solution {
    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        String a = s.substring(0,s.length()/2);
        String b = s.substring(s.length()/2,s.length());
        int c= 0,c1 = 0;
        for(int i = 0;i<a.length();i++){
            if(a.substring(i,i+1).equals("a") || a.substring(i,i+1).equals("e") || a.substring(i,i+1).equals("o") || a.substring(i,i+1).equals("i") || a.substring(i,i+1).equals("u")  ){
                c++;
            }
        }
        System.out.println(c);
        for(int i = 0;i<b.length();i++){
            if(b.substring(i,i+1).equals("a") || b.substring(i,i+1).equals("e") || b.substring(i,i+1).equals("o") || b.substring(i,i+1).equals("i") || b.substring(i,i+1).equals("u")  ){
                c1++;
            }
        }
        System.out.println(c1);
        return c==c1;
    }
}
