

//Time Complexity - O(n)
//Auxilary Space - O(n)




class Solution {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr, int n) {
        // Your code here
        int res=Integer.MAX_VALUE;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                res=Math.min(res,map.get(arr[i]));
            }
            else{
                map.put(arr[i],i);
            }
        }
        if(res==Integer.MAX_VALUE){
            return -1;
        }
        return res+1;
    }
}
