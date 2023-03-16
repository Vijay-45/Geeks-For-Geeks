

//Time complexity - O(logn)
//Auxilary Space - O(1)


class Solution 
{
    int findOnce(int arr[], int n)
    {
        // Complete this function
        int l=0,h=n-2;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==arr[mid^1]){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return arr[l];
    }
}
