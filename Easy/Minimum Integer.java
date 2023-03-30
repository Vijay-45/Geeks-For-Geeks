

//Time Complexity - O(n)
//Auxilary Space - O(1)




class Solution {
    public static int minimumInteger(int n, int[] arr) {
        // code here
        long sum=0;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        for(int i:arr){
           long p=(long)n*i;
           if(p>=sum){
               ans=Math.min(ans,i);
           }
        }
        return ans;
    }
}
        
