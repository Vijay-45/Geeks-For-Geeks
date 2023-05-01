

//Time Compleixty - O(n^2)
//Auxilary Space - O(1)


class Solution
{
    //Function to find transpose of a matrix.
    static void transpose(int arr[][], int n)
    {
        // code here
       int temp=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
}
