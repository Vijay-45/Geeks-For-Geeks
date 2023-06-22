//Time Complexity - O(n)
//Auxilary Space - O(1)

class Solution
{
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String str) {
        // your code here
        int n=str.length();
        String temp=str.toLowerCase();
        int[] arr=new int[26];
        for(int i=0;i<n;i++){
            if(temp.charAt(i)>='a' && temp.charAt(i)<='z'){
                arr[temp.charAt(i)-'a']++;
            }
        }
        for(int i=0;i<26;i++){
            if(arr[i]==0){
                return false;
            }
        }
        return true;
    }
}
