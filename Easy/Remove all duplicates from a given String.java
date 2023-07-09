

//Time Complexity - O(n)
//Auxilary Space - O(1)



class Solution {
    String removeDuplicates(String str) {
        // code here
        int n=str.length();
        String res="";
        int[] arr=new int[256];
        for(int i=0;i<n;i++){
            arr[str.charAt(i)]++;
            if(arr[str.charAt(i)]==1){
                res+=str.charAt(i);
            }
        }
        return res;
    }
}

