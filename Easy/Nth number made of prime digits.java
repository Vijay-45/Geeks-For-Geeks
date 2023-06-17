


//Time Complexity - O(n)
//Auxilary Space - O(n)




class Solution
{
    //Function to find nth number made of only prime digits.
    public static int primeDigits(int n)
    {
        //Your code here
        ArrayList<String> list = new ArrayList<>(Arrays.asList("2","3","5","7"));
        int index=0;
        String res="";
        if(n<=4){
            return Integer.parseInt(list.get(n-1));
        }
        for(int i=5;i<=n;i++){
            res=list.get(index)+list.get((i-1)%4);
            list.add(res);
            if(i%4==0){
                index++;
            }
        }
        return Integer.parseInt(res);
        
    }
}
