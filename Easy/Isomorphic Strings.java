
//Time Complexity - O(n)
//Auxilary Space - O(n)



class Solution
{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String s1,String s2)
    {
        // Your code here
        if(s1.length()!=s2.length()){
            return false;
        }
        else{
            HashMap<Character,Integer> map1=new HashMap<>();
            HashMap<Character,Integer> map2=new HashMap<>();
            for(Integer i=0;i<s1.length();i++){
                if(map1.put(s1.charAt(i),i)!=map2.put(s2.charAt(i),i)){
                    return false;
                }
            }
        }
        return true;
    }
}
