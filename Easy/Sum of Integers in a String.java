

//Time Complexity - O(n)
//Auxilary Space - O(1)






class Solution
{
    //Function to calculate sum of all numbers present in a string.
    public static long findSum(String str)
    {
        // your code here
        int n=str.length();
        long sum=0;
        String res="";
        for(int i=0;i<n;i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                if(res.length()!=0){
                    sum=sum+Long.parseLong(res);
                    res="";
                }
            }
            else{
                    res=res+str.charAt(i);
            }
        }
        if(res.length()!=0){
            sum=sum+Long.parseLong(res);
        }
        return sum;
    }
    
}
