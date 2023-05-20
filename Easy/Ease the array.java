
//Time Complexity - O(n)
//Auxilary Space - O(1)



class Solution{
    void modifyAndRearrangeArr (int arr[], int n) {
        // Complete the function
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1] && arr[i]!=0){
                arr[i-1]*=2;
                arr[i]=0;
            }
        }
        int p=0,temp=0;
        for(int j=0;j<n;j++){
            if(arr[j]!=0){
                temp=arr[j];
                arr[j]=arr[p];
                arr[p]=temp;
                p++;
            }
        }
    }
}


