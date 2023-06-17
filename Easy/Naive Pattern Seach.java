

//Time Complexity - O((n-m+1)* m)
//Auxilary Space - O(1)




class Solution
{
    //Function to check if the given pattern exists in the given string or not.
    static boolean search(String pat, String txt)
    {
            // Your code here
            int n=txt.length();
            int m=pat.length();
            for(int i=0;i<=(n-m);i++){
                String temp=txt.substring(i,i+m);
                if(temp.equals(pat)){
                    return true;
                }
            }
            return false;
    }
    
}

_____________________________________________________________________________________________________________________________________________________________________________



//Time Complexity - O((n-m+1)*m)
//Auxilary Space - O(1)




public class Main
{
	public static void main(String[] args) {
	    String str="AABBCCAACCAABB";
	    String pat="AABB";
	    Solve(str,pat);
	}
	static void Solve(String str,String pat){
	    int n=str.length();
	    int m=pat.length();
	    for(int i=0;i<n;i++){
	        int j;
	        for(j=0;j<m;j++){
	            if(pat.charAt(j)!=str.charAt(i+j)){
	                break;
	            }
	        }
	        if(j==m){
	            System.out.print(i+" ");
	        }
	    }
	} 
}


_____________________________________________________________________________________________________________________________________________________________________________



//Improved Version of the above code it is considered when there are distinct patterns in the string it works on the Theeta(n)

//Time Complexiy - O(n)
//Auxilary Space - O(1)



public class Main
{
	public static void main(String[] args) {
	    String str="ABCEABCFABCD";
	    String pat="ABCD";
	    Solve(str,pat);
	}
	static void Solve(String str,String pat){
	    int n=str.length();
	    int m=pat.length();
	    for(int i=0;i<n;){
	        int j;
	        for(j=0;j<m;j++){
	            if(pat.charAt(j)!=str.charAt(i+j)){
	                break;
	            }
	        }
	        if(j==m){
	            System.out.print(i+" ");
	        }
	        if(j==0){
	            i++;
	        }
	        else{
	            i=(i+j);
	        }
	    }
	} 
}

