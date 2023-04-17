

//Time Complexity - O(n)
//Auxilary Space - O(1)


class Solution {
    int remove_duplicate(int arr[],int n){
        // code here
        int l=1;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]){
                arr[l]=arr[i];
                l++;
            }
        }
        return l;
    }
}
