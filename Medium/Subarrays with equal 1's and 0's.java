

//Time Complexity - O(n)
//Auxilary Space - o(n)






class Solution
{
    //Function to count subarrays with 1s and 0s.
    static int countSubarrWithEqualZeroAndOne(int arr[], int n)
    {
        // add your code here
        int count=0,preSum=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                arr[i]=-1;
            }
        }
        for(int i=0;i<n;i++){
            preSum+=arr[i];
            if(preSum==0) count++;
            if(map.containsKey(preSum)){
                count+=map.get(preSum);
            }
            map.put(preSum,map.getOrDefault(preSum,0)+1);
        }
        return count;
        
    }
}


