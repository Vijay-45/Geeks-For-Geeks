

//Time Complexity - O(n)
//Auxilary Space - O(1)


class Sol
{
    public static int search(int arr[], int n)
    {
        // your code here
        int ans=0;
        for(int i=0;i<n;i++){
            ans=ans^arr[i];
        }
        return ans;
    }
}


__________________________________________________________________________________________________________________________________________________________________________________


//Time Complexity - O(logn)
//Auxilary Space - O(1)



class Sol
{
    public static int search(int arr[], int n)
    {
        // your code here
       int l=0,h=n-1;
       while(l<=h){
           int mid=l+(h-l)/2;
           if(mid==0){
               return arr[mid];
           }
           if(mid==0 && (arr[mid]!=arr[mid+1])){
               return arr[mid];
           }
           if(mid==n-1 && (arr[mid]!=arr[mid-1])){
               return arr[mid];
           }
           if((arr[mid]!=arr[mid-1]) && (arr[mid]!=arr[mid+1])){
               return arr[mid];
           }
           if(mid%2==0){
               if(arr[mid]==arr[mid+1]){
                   l=mid+1;
               }
               else{
                   h=mid-1;
               }
           }
           else{
               if(arr[mid]==arr[mid-1]){
                   l=mid+1;
               }
               else{
                   h=mid-1;
               }
           }
       }
       return -1;
    }
}
