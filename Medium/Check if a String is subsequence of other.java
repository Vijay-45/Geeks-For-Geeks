

//Time Complexity - O(n)
//Auxilary Space - O(1)


class Solution
{
    //Function to check if a string is subsequence of other string.
    public static boolean isSubSequence(String a, String b)
    {
        //code here
        int n=b.length();
        int m=a.length();
        int i=0,j=0;
        while(i<n && j<m){
            if(b.charAt(i)!=a.charAt(j)){
                i++;
            }
            else{
                i++;j++;
            }
        }
        return (j==m);
        
    }
};




_____________________________________________________________________________________________________________________________________________________________________________



//Time Complexity - O(n)
//Auxilary Space - O(n)



public class Main
{
	public static void main(String[] args) {
		String s="abcde";
		String s1="ae";
		int n=s.length();
		int m=s1.length();
		System.out.println(Solve(s,s1,n,m));
	}
	static boolean Solve(String s,String s1,int n,int m){
	    if(m==0) return true;
	    if(n==0) return false;
	    if(s.charAt(n-1) == s1.charAt(m-1)){
	        return Solve(s,s1,n-1,m-1);
	    }
	    return Solve(s,s1,n-1,m);
	}
}
