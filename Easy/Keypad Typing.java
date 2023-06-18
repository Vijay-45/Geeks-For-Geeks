

//Time Complexity - O(n)
//Auxilary Space - O(1)



public static String printNumber(String s, int n) 
{
    //Your code here
    int[] arr={2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,9,9,9,9};
    String res="";
    for(int i=0;i<n;i++){
        res=res+arr[s.charAt(i)-'a'];
    }
    return res;
}
