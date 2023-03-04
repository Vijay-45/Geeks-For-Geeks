

//Time Complexity - O(logn)
//Auxilary Space - O(1)



class Solution
{
    //Function to find the minimum element in sorted and rotated array.
    static int minNumber(int arr[], int l, int h)
    {
        // Your code here
        int res=arr[0];
        while(l<=h){
            int mid=l+(h-l)/2;
            res=Math.min(res,arr[mid]);
            if(arr[l]<arr[mid]){
                if(arr[l]<arr[h]){
                    h=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            else{
                if(arr[mid]<arr[h]){
                    h=mid-1;
                }
                else{
                    if(arr[l]<arr[h]){
                        h=mid-1;
                    }
                    else{
                        l=mid+1;
                    }
                }
            }
        }
        return res;
        
    }
}

______________________________________________________________________________________________________________________________
