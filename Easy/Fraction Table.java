

//Time Complexity - O(K)
//Auxilary Space  - O(1)


class Solution
{
    public int[]  LargestFraction(int n, int d)
    {
        // code here
        int max_den=10000;
        int num=-1;
        int den=1;
        for(int i=max_den;i>=1;i--){
            int nume=(n*i-1)/d;
            if(Gcd(nume,i)==1 && (nume*den>=i*num)){
                num=nume;
                den=i;
            }
        }
         return new int[] {num,den};
    }
    public int Gcd(int a,int b){
        if(b==0) return a;
        return Gcd(b,a%b);
    }
