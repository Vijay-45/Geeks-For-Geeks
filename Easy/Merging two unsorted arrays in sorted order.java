

//Time Complexity - O(nlogn+mlogm+(m+n))
//Auxilary Space - O(m+n)




class Solution
{
    void sortedMerge(long a[], long b[], long res[], int n,int m)
    {
        // Your code goes here
        long[] ans=new long[n+m];
        for(int i=0;i<n;i++){
            ans[i]=a[i];
        }
        for(int j=n;j<n+m;j++){
            ans[j]=b[j-n];
        }
        Arrays.sort(ans);
        for(int i=0;i<n+m;i++){
            res[i]=ans[i];
        }
        
        
    }
}
