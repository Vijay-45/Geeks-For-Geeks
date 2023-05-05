

//time Compleixty - O(r*c)
//Auxilary Space - O(1)


class Solution
{
    //Function to reverse the columns of a matrix.
    static void reverseCol(int arr[][])
    {
        // code here 
        int r=arr.length;
        int c=arr[0].length;
        int temp=0;
        for(int i=0;i<r;i++){
            int min=0,max=c-1;
            while(min<max){
                temp=arr[i][min];
                arr[i][min]=arr[i][max];
                arr[i][max]=temp;
                min++;max--;
            }
        }
    }
}
