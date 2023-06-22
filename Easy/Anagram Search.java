

//Time Compleixty - O(n-m+1*(m))
//Auxilary Space - O(1)


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String s="geeksforgeeks";
		String s1="frog";
		System.out.println(Solve(s,s1));
	}
	public static final int c=256;
	static boolean Solve(String s,String s1){
	    int n=s.length();
	    int m=s1.length();
	    for(int i=0;i<=(n-m);i++){
	       if(isAnagram(s,s1,i)){
	           return true;
	       }
	    }
	    return false;
	}
	static boolean isAnagram(String s,String s1,int i){
	    int[] arr=new int[c];
	    for(int j=0;j<s1.length();j++){
	        arr[s1.charAt(j)]++;
	        arr[s.charAt(i+j)]--;
	    }
	    for(int j=0;j<c;j++){
	        if(arr[i]!=0){
	            return false;
	        }
	    }
	    return true;
	}
}
