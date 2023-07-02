

//Time Complexity - O(n)
//Auxilary Space - o(1)




class Solution {

    String maxOdd(String s) {
        // code here
        int n=s.length();
        for(int i=n-1;i>=0;i--){
            if((s.charAt(i)-'0')%2!=0){
                return s.substring(0,i+1);
            }
        }
        return "";
    }
}
