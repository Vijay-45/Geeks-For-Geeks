
//Time Complexity - O(n)
//Auxilary Space - O(1)

class Solution {
    //Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        if(k>n){
            Reverse(arr,0,n-1);
            return;
        }
        int start=0;
        int end=k-1;
        int sub=end+1;
        if(start==end){
            return;
        }
        Reverse(arr,start,end);
        while((sub+(k-1))<n){
            Reverse(arr,sub,sub+(k-1));
            sub=sub+k;
        }
        if((n-sub)<k){
            Reverse(arr,sub,n-1);
        }
    }
    void Reverse(ArrayList<Integer> arr,int start,int end){
        while(start<end){
            Collections.swap(arr,start,end);
            start++;end--;
        }
    }
}
