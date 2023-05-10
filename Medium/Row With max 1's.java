

//Time Complexity - O(n*m)
//Auxilary Space - O(1)





class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int ans=0,res=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<m;j++){
                if(arr[i][j]==1){
                    count++;
                }
            }
            if(count>res){
                res=count;
                ans=i;
            }
        }
        if(res==0){
            return -1;
        }
        return ans;
    }
}
