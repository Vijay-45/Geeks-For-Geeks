

//Time Complexity - O(n*klok)
//Auxilary Space - o(n*k)



class Solution {
    public List<List<String>> Anagrams(String[] arr) {
        // Code here
        if(arr==null || arr.length==0) return new ArrayList<>();
        Map<String,List<String>> map=new HashMap<>();
        for(String s:arr){
            char[] arr1=s.toCharArray();
            Arrays.sort(arr1);
            String res=String.valueOf(arr1);
            if(!map.containsKey(res)){
                map.put(res,new ArrayList<>());
            }
            map.get(res).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
