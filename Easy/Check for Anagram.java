

//Time Complexity  - O(n^2)
//Auxilary Space - O(n)



import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    String s1="aab";
	    String s2="bab";
	    System.out.println(Solve(s1,s2));
	}
	static boolean Solve(String s1,String s2){
	    if(s1.length()!=s2.length()){
	        return false;
	    }
	    else{
	        int n=s1.length();
	        char[] temp=s2.toCharArray();
	        for(int i=0;i<n;i++){
	            char c=s1.charAt(i);
	            boolean flag=false;
	            for(int j=0;j<n;j++){
	                if(temp[j]==c){
	                    flag=true;
	                    temp[j]='1';
	                    break;
	                }
	            }
	            if(!flag){
	                return false;
	            }
	        }
	    }
	    return true;
	}
}

_____________________________________________________________________________________________________________________________________________________________________________




//Time Compleixty - O(nlogn)
//Auxilary Space - O(n)


import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    String s1="aab";
	    String s2="bab";
	    System.out.println(Solve(s1,s2));
	}
	static boolean Solve(String s1,String s2){
	    if(s1.length()!=s2.length()){
	        return false;
	    }
	    
	   int n=s1.length();
	   char[] arr1=s1.toCharArray();
	   Arrays.sort(arr1);
	   String temp=new String(arr1);
	   char[] arr2=s2.toCharArray();
	   Arrays.sort(arr2);
	   String temp1=new String(arr2);
	    return temp.equals(temp1);
	}
}
