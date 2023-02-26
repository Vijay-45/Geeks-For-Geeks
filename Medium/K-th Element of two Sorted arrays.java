

//Time Complexity - O(n+m)
//Auxilary Space - O(n+m)


class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        int index=0,i=0,j=0;
        int[] arr=new int[n+m];
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                arr[index++]=arr1[i++];
            }
            else{
                arr[index++]=arr2[j++];
            }
        }
        while(i<n){
            arr[index++]=arr1[i++];
        }
        while(j<m){
            arr[index++]=arr2[j++];
        }
        
        long res=(long)arr[k-1];
        return res;
    }
}
