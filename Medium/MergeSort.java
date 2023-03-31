

//Time Complexity - O(nlogn)
//Auxilary Space - O(n)





class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
         // Your code here
         int n1=m-l+1,n2=r-m;
         int[] left = new int[n1];
         int[] right = new int[n2];
         
         
         
         for(int i=0;i<n1;i++){
             left[i]=arr[i+l];
         }
         for(int i=0;i<n2;i++){
             right[i]=arr[m+i+1];
         }
         
         int i=0,j=0,k=l;
         while(i<n1 && j<n2){
             if(left[i]<right[j]){
                arr[k++]=left[i++];
             }
             else{
                 arr[k++]=right[j++];
             }
         }
         while(i<n1){
             arr[k++]=left[i++];
         }
         while(j<n2){
             arr[k++]=right[j++];
         }
         
    }
    void mergeSort(int arr[], int l, int r)
    {
        //code here
        if(l<r){
            int mid = l+(r-l)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }
}
