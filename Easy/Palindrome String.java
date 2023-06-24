


//Time Complexity - O(n)
//Auxilary Space - O(1)



class Solution {
    int isPalindrome(String s) {
        // code here
        int n=s.length();
        int i=0,e=n-1;
        while(i<e){
            if(s.charAt(i)!=s.charAt(e)){
                return 0;
            }
            i++;e--;
        }
        return 1;
    }
};
