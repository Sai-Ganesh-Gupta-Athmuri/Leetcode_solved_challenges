class Solution {
    public String interpret(String command) {
        String s = "";
        for(int i = 0;i<command.length()-1;i++){
            if(command.charAt(i)=='(' && command.charAt(i+1)==')'){
                s+="o";
                i++;
            }
            else if(command.charAt(i)=='(' && command.charAt(i+1)!=')'){
                int j = i+1;
                while(command.charAt(j)!=')'){
                    s+=command.charAt(j)+"";
                    j++;
                }
                i = j;

            }
            else{
                s+=command.charAt(i)+"";
            }
            
        }
        if(command.charAt(command.length()-1)!=')'){
                s+=command.charAt(command.length()-1);
        }
        System.out.println(s);
        return s;
    }
}
