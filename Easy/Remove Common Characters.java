

//Time Complexity - O(n)
//Auxilary Space - O(1)




class Solution
{
    //Function to remove common characters and concatenate two strings.
    public static String concatenatedString(String s1,String s2)
    {
        // Your code here
        String res="";
        for(int i=0;i<s1.length();i++){
            if(s2.indexOf(s1.charAt(i))==-1){
                res=res+s1.charAt(i);
            }
        }
        for(int i=0;i<s2.length();i++){
            if(s1.indexOf(s2.charAt(i))==-1){
                res=res+s2.charAt(i);
            }
        }
        if(res.length()==0){
            return "-1";
        }
        return res;
    }
}
