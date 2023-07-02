

//Time Complexity - O(n)
//Auxilary Space - o(1)




class Solution {

    String maxOdd(String s) {
        // code here
        int n=s.length();
        String res="";
        for(int i=0;i<n;i++){
            if((s.charAt(i)-'0')%2!=0){
                res=s.substring(0,i+1);
            }
        }
        return res;
    }
}
