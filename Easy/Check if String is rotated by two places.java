

//Time Complexity - O(1)
//Auxilary Space - O(1)




class Solution
{
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean isRotated(String str1, String str2)
    {
        // Your code here
        if(str1.length()!=str2.length()) return false;
        
       if(str1.length()==1 ||str1.length()==2) return str1==str2;
       int n=str1.length();
       str1=str1+str1;
       int res=str1.indexOf(str2);
       if(res==2 || res==n-2){
           return true;
       }
       return false;
    }
    
}
