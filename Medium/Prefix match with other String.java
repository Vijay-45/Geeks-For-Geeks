
//Time Complexity - O(n)
//Auxilary Space - O(1)




class Solution
{
    public int klengthpref(String[] arr, int n, int k, String s)
    {
        // code here
        if(k>s.length()){
            return 0;
        }
        String temp=s.substring(0,k);
        int res=0;
        for(int i=0;i<n;i++){
            if(arr[i].length()>=k){
                if(temp.equals(arr[i].substring(0,k))){
                    res++;
                }
            }
        }
        return res;
    }
}
