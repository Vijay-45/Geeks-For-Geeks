

//Time Complexity - O(r*C)
//Auxilary Space - O(1)



class Solution
{
    //Function to interchange the rows of a matrix.
    static void interchangeRows(int arr[][])
    {
        // code here 
        int r=arr.length;
        int c=arr[0].length;
        int temp=0;
        for(int i=0;i<c;i++){
            int min=0,max=r-1;
            while(min<max){
                temp=arr[min][i];
                arr[min][i]=arr[max][i];
                arr[max][i]=temp;
                min++;max--;
            }
        }
    }
}
