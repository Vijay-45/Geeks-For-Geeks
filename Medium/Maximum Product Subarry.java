

//Time Complexity - O(n)
//Auxilary Space - O(1)



class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
        long res=Long.MIN_VALUE;
        long pre=1,suf=1;
        for(int i=0;i<n;i++){
            pre*=arr[i];
            suf*=arr[n-i-1];
            res=Math.max(res,Math.max(pre,suf));
            
            if(pre==0) pre=1;
            if(suf==0) suf=1;
        }
        return res;
    }
}
