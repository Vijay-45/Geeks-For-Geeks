

//Time Complexity - O(n)
//Auxilary Space -O(1)



class Solution
{
    //Function to sort the binary array.
    static void binSort(int arr[], int n)
    {
        // add your code here
        int i=-1;
        int temp=0;
        for(int j=0;j<n;j++){
            if(arr[j]==0){
                i++;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        
        /**************
        * No need to print the array
        * ************/
    }
}


