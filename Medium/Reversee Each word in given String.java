

//Time Complexity - O(n^2)
//Auxilary Space - O(1)


class Solution
{
   
    String reverseWords(String s)
    {
        // your code here
        int n=s.length();
        int st=0,i=0;
        String res="";
        for(i=0;i<n;i++){
            if(s.charAt(i)=='.'){
                res+=Reverse(s.substring(st,i))+".";
                st=i+1;
            }
        }
        res+=Reverse(s.substring(st,i));
        return res;
    }
    String Reverse(String s){
        int n=s.length();
        String res="";
        for(int i=n-1;i>=0;i--){
            res+=s.charAt(i);
        }
        return res;
    }
}
