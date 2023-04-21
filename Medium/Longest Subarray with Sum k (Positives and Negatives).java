

//Time Complexity - O(n)
//Auxilary Space - O(n)



class Solution{
    
   
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int arr[], int n, int k) {
        //Complete the function
        int maxLen=0;
        int sum=0;
        
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            sum+=arr[i];
            
            if(sum==k){
                maxLen=Math.max(maxLen,i+1);
            }
            
            int rem=sum-k;
            
            if(map.containsKey(rem)){
                int len=i-map.get(rem);
                maxLen=Math.max(maxLen,len);
            }
            
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        
        return maxLen;
    }
    
    
}


