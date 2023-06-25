

//Time Complexity - O(n)
//Auxilary Space - O(1)



class Solution {
    String removeDups(String s) {
        // code here
        int n=s.length();
        String res="";
        int[] arr=new int[256];
        for(int i=0;i<n;i++){
            if(arr[s.charAt(i)]<1){
                res=res+s.charAt(i);
                arr[s.charAt(i)]++;
            }
        }
        return res;
    }
}
