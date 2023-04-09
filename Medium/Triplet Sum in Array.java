

//Time Complexity - O(n^2)
//Auxilary Space -  O(1)

class Solution
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int arr[], int n, int x) { 
    
       // Your code Here
       Arrays.sort(arr);
       for(int i=0;i<n-2;i++){
           int l=i+1,r=n-1;
           while(l<r){
               int sum=arr[i]+arr[l]+arr[r];
               if(sum==x){
                   return true;
               }
               else if(sum < x){
                   l++;
               }
               else{
                   r--;
               }
           }
       }
       return false;
    
    }
}
