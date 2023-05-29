

//Time Complexity - O(n)
//Auxilary Space - o(n)




class Solution {
    // Function to find largest number with minimum frequency
    public static int LargButMinFreq(int arr[], int n) {
        // Your code here
        int res=0;
        int temp=Integer.MAX_VALUE;
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            temp=Math.min(temp,entry.getValue());
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==temp){
                res=Math.max(res,entry.getKey());
            }
        }
        return res;
    }
}
