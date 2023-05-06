

//Time Complexity - O(n*n)
//Auxilary Space - O(1)




class Solution 
{
    //Function to find minimum number of operations that are required 
    //to make the matrix beautiful.
    static int findMinOperation(int arr[][], int n)
    {
        // code here 
        int total=0;
        int mx=0;
        for(int i=0;i<n;i++){
            int rSum=0,cSum=0;
            for(int j=0;j<n;j++){
                rSum+=arr[i][j];
                cSum+=arr[j][i];
                total+=arr[i][j];
            }
            mx=Math.max(mx,Math.max(rSum,cSum));
        }
        return (n*mx-total);
    }
}
