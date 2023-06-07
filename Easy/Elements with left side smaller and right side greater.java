

//Time Compleixty - O(n)
//Auxilary Space - O(n)




class Compute {
    public int findElement(int arr[], int n){
        int[] left=new int[n];
        int[] right=new int[n];
        int max=arr[0];
        for(int i=0;i<n;i++){
            max=Math.max(max,arr[i]);
            left[i]=max;
        }
        int min=arr[n-1];
        for(int i=n-1;i>=0;i--){
            min=Math.min(min,arr[i]);
            right[i]=min;
        }
        
        for(int i=1;i<n-1;i++){
            if(arr[i]>=left[i-1] && arr[i]<=right[i+1]){
                return arr[i];
            }
        }
        return -1;
    }
}
