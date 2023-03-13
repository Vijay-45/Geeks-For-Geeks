

//Time Complexity - O(n)
//Auxilary Space - O(1)



class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int rep=0,miss=0;
        for(int i=0;i<n;i++){
            int temp=arr[Math.abs(arr[i])-1];
            if(temp<0){
                rep=Math.abs(arr[i]);
            }
            else{
                arr[Math.abs(arr[i])-1] = -arr[Math.abs(arr[i])-1];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                miss=i+1;
            }
        }
     
        return new int[]{rep,miss};
    }
}
