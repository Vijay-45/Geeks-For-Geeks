

//Time Complexity - O(n)
//Auxilary Space - O(1)

class Solution {
    static Long numGame(Long n) {
        // code here
        int mod=1000000007;
        if(n==1) return (long)1;
        long res=1;
        for(int i=2;i<=n;i++){
            res=((res*i)/Gcd(i,res))%mod;
        }
        
        return res;
    }
    static long Gcd(long a,long b){
        if(b==0){
            return a;
        }
        else{
            return Gcd(b,a%b);
        }
    }
};
