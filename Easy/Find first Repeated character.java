

//Time Complexity - O(n)
//Auxilary Space - O(1)



class Solution 
{ 
    static final int val=256;
    String firstRepChar(String s) 
    { 
        // code here
        int n=s.length();
        int[] arr=new int[val];
        for(int i=0;i<n;i++){
            if(arr[s.charAt(i)]==1){
                return s.charAt(i)+"";
            }
            arr[s.charAt(i)]++;
        }
        return "-1";
    }
} 
