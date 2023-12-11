class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int c = 0;
        for(int i = 0;i<operations.length;i++){
            if(operations[i].equals("--X") || operations[i].equals("X--")){
                c-=1;
            }
            if(operations[i].equals("++X") || operations[i].equals("X++")){
                c+=1;
            }
        }
        return c;
    }
}
