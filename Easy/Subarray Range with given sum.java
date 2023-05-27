

//Time Complexity - O(n)
//Auxilary Space - O(n)





class Solution
{
    //Function to count the number of subarrays which adds to the given sum.
    static int subArraySum(int arr[], int n, int sum)
    {
        // add your code here
        int preSum=0,count=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            preSum+=arr[i];
            if(preSum==sum) count++;
            if(map.containsKey(preSum-sum)){
                count+=map.get(preSum-sum);
            }
            map.put(preSum,map.getOrDefault(preSum,0)+1);
        }
        return count;
    }
}
