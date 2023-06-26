

//Time Complexity - O(n)
//Auxilary Space - O(1)




class Solution
{
    String secFrequent(String arr[], int n)
    {
        // your code here
        String second="";
        int res1=Integer.MIN_VALUE;
        int res2=Integer.MIN_VALUE;
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
            res1=Math.max(res1,map.get(arr[i]));
        }
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue()<res1 && entry.getValue()>res2){
                res2=entry.getValue();
                second=entry.getKey();
            }
        }
        return second;
        
    }
}
