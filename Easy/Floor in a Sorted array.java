

//Time Complexity - O(logn)
//Auxilary Space - O(1)


class Solution{
    
    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x)
    {
        int l=0,h=n-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]>x){
                h=mid-1;
            }
            else if(arr[mid]<x){
                l=mid+1;
            }
            else {
                return mid;
            }
            
        }
        return h;
        
    }
    
}
