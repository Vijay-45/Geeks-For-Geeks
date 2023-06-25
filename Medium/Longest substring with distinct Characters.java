

//Time Complexity - O(n^3)
//Auxilary Space - O(1)



import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String s="afgabcde";
		System.out.println(Solve(s));
	}
	static int Solve(String s){
	    int n=s.length();
	    int res=0;
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n;j++){
	            if(isDistinct(s,i,j)){
	                res=Math.max(res,j-i+1);
	            }
	        }
	    }
	    return res;
	}
	static boolean isDistinct(String s,int st,int en){
	    boolean[] arr=new boolean[256];
	    Arrays.fill(arr,false);
	    for(int i=st;i<=en;i++){
	        if(arr[s.charAt(i)]){
	            return false;
	        }
	        else{
	            arr[s.charAt(i)]=true;
	        }
	    }
	    return true;
	}
}
