

//Time Complexity - O(1)
//Auxilary Space - O(1)



class Solution {
    public long minOperations(int N) {
        // Code here
        int mid=N/2;
        return (N%2==0)?(long)mid*(long)mid : (long)mid * (long)(mid+1);
    }
}
