

//Time Complexity - O(nlogn)
//Auxilary Space - O(1)


class Solution {

    public long minValue(long a[], long b[], long n) 
    {
        // Your code goes here
        long res=0;
        n=(int)n;
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<n;i++){
            res+=a[i]*b[(int)n-i-1];
        }
        return res;
    }
}
