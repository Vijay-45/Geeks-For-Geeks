

//Time Complexity - O(n*m)
//Auxilary Space - O(1)





class Solution
{
    /*You are required to complete this method*/
    int findK(int arr[][], int n, int m, int k)
    {
        int top=0,bottom=n-1,left=0,right=m-1;
        int temp=1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                if(temp++==k) return arr[top][i];
            }
            top++;
            for(int i=top;i<=bottom;i++){
                if(temp++==k) return arr[i][right];
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    if(temp++==k) return arr[bottom][i];
                }
            }
            bottom--;
            if(left<=right){
               for(int i=bottom;i>=top;i--){
                   if(temp++==k) return arr[i][left];
               }
            }
            left++;
        }
        return -1;
    }
}
