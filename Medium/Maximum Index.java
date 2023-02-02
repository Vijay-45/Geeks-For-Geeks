
//Time Complexity - O(n)
//Auxilary Space - O(1)


class Solution{
    
    // A[]: input array
    // N: size of array
    // Function to find the maximum index difference.
    static int maxIndexDiff(int arr[], int n) { 
        
        // Your code here
        int max=0,i=0,j=n-1;
        while(i<=j){
            if(arr[i]<=arr[j]){
                max=Math.max(max,j-i);
                i++;
                j=n-1;
            }
            else{
                j--;
            }
        }
        return max;
        
    }
}
