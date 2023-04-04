

//Time Complexity - O(nlogn)
//Auxilary Space - O(1)



class Solution{
    //Function to find minimum difference between any pair of elements in an array.
    public static int MinimumDifference(int arr[], int n)
    {
        // code here
        Arrays.sort(arr);
        int res=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            res=Math.min(res,Math.abs(arr[i]-arr[i-1]));
        }
        return res;
    }
};
