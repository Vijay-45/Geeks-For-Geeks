

//Time Complexity - O(n)
//Auxilary Space - O(1)

class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        long res=arr[0];
        int maxIndex=arr[0];
        for(int i=1;i<n;i++){
            maxIndex=Math.max(maxIndex+arr[i],arr[i]);
            res=Math.max(res,maxIndex);
        }
        return res;
        
    }
    
}
