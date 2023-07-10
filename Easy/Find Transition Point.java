

//Time Complexity -  o(logn)
//Auxilary Space - O(1)



class GfG {
    int transitionPoint(int arr[], int n) {
        // code here
        int l=0,h=n-1;
        while(l<=h){
            int mid=(l+h)/2;
            if((mid==0 || arr[mid-1]==0) && arr[mid]==1){
                return mid;
            }
            else if(arr[mid]==0){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return -1;
    }
}
