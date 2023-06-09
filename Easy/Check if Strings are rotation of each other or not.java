

//Time Complexity - O(1)
//Auxilary Space - O(1)



class Solution
{
    //Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2 )
    {
        // Your code here
        if(s1.length()!=s2.length()){
            return false;
        }
        s1=s1+s1;
        return (s1.indexOf(s2)!=-1)?true:false;
    }
    
}
