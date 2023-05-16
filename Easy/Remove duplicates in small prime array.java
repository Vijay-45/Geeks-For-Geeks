

//Time Complexity - O(n)
//Auxilary Space  - O(k)

// k means number of unique elements in the array.....



class Solution
{
    ArrayList<Integer> removeDuplicate(int arr[], int n)
    {
        // code here 
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map  = new LinkedHashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            list.add(entry.getKey());
        }
        return list;
    }
}
