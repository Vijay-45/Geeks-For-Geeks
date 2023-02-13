

//Time Complexity - O(n)
//Auxilary Space - O(1)


class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int n, int p)
    {
        // code here
        int i=0;
        while(i<n){
            if(arr[i]<=0 && arr[i]<=n){
                i++;
                continue;
            }
            int index=arr[i]-1;
            if(index>=n){
                i++;
                continue;
            }
            if(arr[index]>0){
                arr[i]=arr[index];
                arr[index]=-1;
            }
            else{
                arr[index]--;
                
                arr[i]=0;
                i++;
            }
        }
        for(int k=0;k<n;k++){
            if(arr[k]>0){
                arr[k]=0;
            }
            else{
                arr[k]=arr[k]*(-1);
            }
        }
        
    }
}
