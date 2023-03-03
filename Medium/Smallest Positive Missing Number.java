

//Time Complexity - O(n)
//Auxialry Space - O(1)


class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int n)
    {
        // Your code here
        for(int i=0;i<n;i++){
             
             int ele=arr[i];
             if(arr[i]>0 && arr[i]<=n){
                 int ch=ele-1;
                 if(arr[ch]!=arr[i]){
                     int temp=arr[i];
                     arr[i]=arr[ch];
                     arr[ch]=temp;
                     i--;
                 }
             }
        }
        
        for(int j=0;j<n;j++){
            if(arr[j]!=j+1) return j+1;
        }
        return n+1;
    }
}
