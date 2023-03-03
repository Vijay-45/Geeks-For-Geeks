

//Time Complexity - O(n)
//Auxilary Space - O(n)

class Solution 
{
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) 
    {
        // your code here,return the answer
        int con=n/k;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue()>con){
                count++;
            }
        }
        return count;
    }
}
