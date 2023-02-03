//Time Complexity - O(1)
//Auxilary Space - O(1)


class Solution {
    static int matchGame(Long N){
        // code here
        if(N%5==0){
            return -1;
        }
        else{
            int a=(int)(N%5);
            return a;
        }
    }
};
