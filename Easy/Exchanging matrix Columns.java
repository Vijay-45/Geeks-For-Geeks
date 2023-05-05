

//Time Complexity - O(r*c)
//Auxilary Space - O(1)




class Solution
{
    //Function to exchange first column of a matrix with its last column.
    static void exchangeColumns(int arr[][])
    {
        // code here 
        int temp=0;
        int n1=arr.length;
        int m1=arr[0].length;
        for(int i=0;i<n1;i++){
            temp=arr[i][0];
            arr[i][0]=arr[i][m1-1];
            arr[i][m1-1]=temp;
        }
    }
}
