

//Time Complexity - O(n)
//Auxialry Space - O(n)


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if((entry.getValue()) > 1){
                list.add(entry.getKey());
            }
        }
        if(list.isEmpty()){
            list.add(-1);
            return list;
        }
        Collections.sort(list);
        return list;
      
    }
}
