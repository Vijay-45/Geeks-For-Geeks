

//Time Complexity - O(logn)
//Auxilary Space - O(1)



class Solution
{
  
    // n: size of array
    // x: element to find
    //Function to find index of element x in the array if it is present.
    static long closer(int arr[], int n, long x)
    {
        // add your code here
        

        int l=0,h=n-1;
        while(l<h){
          int mid=l+(h-l)/2;
          if(arr[mid]==x) return (long)mid;
          else if(mid!=0 && arr[mid-1]==x) return mid-1;
          else if(mid!=n-1 && arr[mid+1]==x) return mid+1;
          else if(arr[mid]<x){
              l=mid+1;
          }
          else{
              h=mid-1;
          }
        }
        return -1;
    }
}
