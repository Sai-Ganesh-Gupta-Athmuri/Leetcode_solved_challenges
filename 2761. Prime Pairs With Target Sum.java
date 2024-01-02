class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        List<List<Integer>> arr = new ArrayList<>();
        boolean[] primes = new boolean[n+1];
        for(int i = 2;i*i<=n;i++){
            if(!primes[i]){
                for(int j = i*i;j<=n;j+=i){
                    primes[j] = true;
                }
            }
        }
        for(int i = 2;i<=n/2;i++){
            if(!primes[i] && (!primes[n-i])){
                ArrayList<Integer> res = new ArrayList<>();
                res.add(i);
                res.add(n-i);
                arr.add(res);
            }
        }
        return arr;
    }
}
