

//Time Complexity - O(n)
//Auxilary Space - O(1)


class Solution
{
    //Function to find minimum number of characters which Ishaan must insert  
    //such that string doesn't have three consecutive same characters.
    public static long modified(String a)
    {
        // Your code here
        int n=a.length();
        long res=0;
        for(int i=1;i<(n-1);i++){
            if((a.charAt(i)==a.charAt(i-1)) && (a.charAt(i)==a.charAt(i+1))){
                res++;
                i++;
            }
        }
        return res;
    }
}
