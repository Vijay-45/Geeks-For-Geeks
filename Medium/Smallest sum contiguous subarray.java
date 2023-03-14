

//Time Complexity - O(n)
//Auxilary Space - O(1)


class Solution
{
    static int smallestSumSubarray(int arr[], int n)
    {
        // your code here
        int count=arr[0];
        int res=arr[0];
        for(int i=1;i<n;i++){
            count=Math.min(arr[i],count+arr[i]);
            res=Math.min(res,count);
        }
        return res;
    }
}
