

//Time Complexity - O(n)
//Auxilary Space - O(n)


class Solution {
    static int safePos(int n, int k) {
        // code here
        
        if(n==1) return 1;
        
        return (safePos(n-1,k)+k-1)%n+1;
    }
};

