class Solution {
    public int countPrimes(int n) {
        if(n <= 2) return 0;
        else{
            boolean[] primes = new boolean[n+1];
            for(int i = 2;i*i<=n;i++){
                if(!primes[i]){
                    for(int j = i*i;j<=n;j+=i){
                        primes[j] = true;
                    }
                }
            }
            int c = 0;
            for(int i = 2;i<n;i++){
                if(!primes[i]) c++;
            }
            return c;
        }
    }
}
