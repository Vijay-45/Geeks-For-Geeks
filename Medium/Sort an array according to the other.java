

//Time Complexity  - O(n*m)
//Auxilary Space - O(1)





class Solution{
    // A1[] : the input array-1
    // N : size of the array A1[]
    // A2[] : the input array-2
    // M : size of the array A2[]
    
    //Function to sort an array according to the other array.
    public static int[] sortA1ByA2(int arr[], int n, int arr1[], int m)
    {
        //Your code here
        int x=0,temp=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr1[i]==arr[j]){
                    temp=arr[j];
                    arr[j]=arr[x];
                    arr[x]=temp;
                    x++;
                }
            }
        }
        int key=arr1[m-1];
        int nes=0;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                nes=i+1;
            }
        }
        for(int i=nes;i<n-1;i++){
            for(int j=nes;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}
