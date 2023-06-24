

//Time Complexity - O(n)
//Auxilary Space - O(1)



class Solution
{
    //Function to find lexicographic rank of a string.
    static final int CHAR=256;
    static final int mod=1000000007;
    static int findRank(String s) 
    {
        long res=1;
        int n=s.length();
        long[] fact=new long[n];
        fact[0]=1;
        for(int i=1;i<n;i++){
            fact[i]=(fact[i-1]*i)%mod;
        }
        int[] arr=new int[CHAR];
        for(int i=0;i<n;i++){
            if(arr[s.charAt(i)]==1){
                return 0;
            }
            arr[s.charAt(i)]++;
        }
        for(int i=1;i<CHAR;i++){
            arr[i]+=arr[i-1];
        }
        for(int i=0;i<n-1;i++){
            res=res+(arr[s.charAt(i)-1]*fact[n-i-1])%mod;
            res%=mod;
            for(int j=s.charAt(i);j<CHAR;j++){
                arr[j]--;
            }
        }
        return (int)res%mod;
    }
}
