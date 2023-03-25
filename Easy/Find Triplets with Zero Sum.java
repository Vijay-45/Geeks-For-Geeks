

//Time Complexit - O(n^2)
//Auxilary Space - O(1)


class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        //add code here.
        Arrays.sort(arr);
        
       for(int i=0;i<n;i++){
           int s=i+1,e=n-1;
           while(s<e){
               if((arr[i]+arr[s]+arr[e])==0){
                   return true;
               }
               else if((arr[i]+arr[s]+arr[e]) > 0){
                   e--;
               }
               else{
                   s++;
               }
           }
       }
       return false;
    }
}
