

//Time Complexity - O(n)
//Auxilary Space - O(Distinct elements)


class Solution
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String s)
    {
        // Your code here
        int n=s.length();
        int max=0;
        char c='z';
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer>entry:map.entrySet()){
            max=Math.max(entry.getValue(),max);
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()==max && entry.getKey()<c){
                c=entry.getKey();
            }
        }
        return c;
    }
    
}
