

//Time Complexity - O((n-m+1)* m)
//Auxilary Space - O(1)




class Solution
{
    //Function to check if the given pattern exists in the given string or not.
    static boolean search(String pat, String txt)
    {
            // Your code here
            int n=txt.length();
            int m=pat.length();
            for(int i=0;i<=(n-m);i++){
                String temp=txt.substring(i,i+m);
                if(temp.equals(pat)){
                    return true;
                }
            }
            return false;
    }
    
}
