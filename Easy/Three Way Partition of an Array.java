

//Time Complexity - O(n)
//Auxilary Space - O(n)



class Solution{
    //Function to partition the array around the range such 
    //that array is divided into three parts.
    public void threeWayPartition(int arr[], int a, int b)
    {
        // code here 
        int n=arr.length;
        int[] temp=new int[n];
        
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i]<a){
                temp[index++]=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]>=a && arr[i]<=b){
                temp[index++]=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]>b){
                temp[index++]=arr[i];
            }
        }
        
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
    }
}
