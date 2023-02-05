
//Time Complexity - O(n)
//Auxilary Space - O(1)



class Solution
{
    //Function to rotate an array by d elements in counter-clockwise direction. 
    static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
       d=d%n;
       Reverse(arr,0,d-1);
       Reverse(arr,d,n-1);
       Reverse(arr,0,n-1);
    }
    static void Reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}

