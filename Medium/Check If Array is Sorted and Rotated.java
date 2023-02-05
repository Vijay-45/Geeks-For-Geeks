
//Time Complexity - O(n)
//Auxilary Space - O(1)



class Solution{    
    
    // arr[]: input array
    // num: size of array
    // Function to check if array is sorted and rotated
    public static boolean checkRotatedAndSorted(int arr[], int n){
        
        // Your code here
        int c1=0,c2=0;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]) c1++;
            if(arr[i]<arr[i-1]) c2++;
        }
        
        if(c2==n-2){
            if(arr[n-1]>arr[0]) return true;
            else{
                return false;
            }
            
        }
        if(c1==n-2){
            if(arr[n-1]<arr[0]) return true;
            else{
                return false;
            }
        }
        return false;
        
    }
    
}
