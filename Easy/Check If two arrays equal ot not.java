

//Time Complexity - O(n)
//Auxilary Space - O(n)





class Solution{
    //Function to check if two arrays are equal or not.
    public static boolean check(long a[],long b[],int n)
    {
        //Your code here
       HashMap<Long,Integer> map = new HashMap<>();
       for(int i=0;i<n;i++){
           if(map.containsKey(a[i])){
               map.put(a[i],map.get(a[i])+1);
           }
           else{
               map.put(a[i],1);
           }
       }
       
       for(int i=0;i<n;i++){
           if(map.containsKey(b[i])){
               map.put(b[i],map.get(b[i])-1);
           }
       }
       
       for(Map.Entry<Long,Integer> entry:map.entrySet()){
           if(entry.getValue()!=0){
               return false;
           }
       }
       return true;
    }
}
