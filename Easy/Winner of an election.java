

//Time Complexity - O(n)
//Auxilary Space - o(n)


class Solution
{
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n)
    {
        // add your code
        TreeMap<String,Integer> map = new TreeMap<>();
        int len=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        String[] ans=new String[2];
        for(Map.Entry<String,Integer>entry:map.entrySet()){
            if(entry.getValue()>len){
                len=entry.getValue();
                ans[0]=entry.getKey();
                ans[1]=len+"";
            }
        }
        return ans;
    }
}

