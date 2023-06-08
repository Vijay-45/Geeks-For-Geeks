

//Time Complexity - O(n^2)
//Auxilary Space - O(1)


class Solution
{
    //Function to count the number of substrings that start and end with 1.
    public static int binarySubstring(int n, String s)
    {
        // Your code here
        int count=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                for(int j=i+1;j<n;j++){
                    if(s.charAt(j)=='1'){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}

____________________________________________________________________________________________________________________________________________________________________________



//Time Complexity - O(n)
//Auxilary Space - O(1)




class Solution
{
    //Function to count the number of substrings that start and end with 1.
    public static int binarySubstring(int n, String s)
    {
        // Your code here
        int count=0,temp=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                count+=temp;
                temp++;
            }
        }
        return count;
    }
}



import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String s="1111";
		Solve(s);
	}
	static void Solve(String s){
	    int n=s.length();
	    int count=0;
	    for(int i=0;i<n;i++){
	        if(s.charAt(i)=='1'){
	            count++;
	        }
	    }
	    System.out.println((n*(n-1))/2);
	}
}
