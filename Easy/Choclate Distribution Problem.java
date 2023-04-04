


//Time Complexity - O(nlogn)
//Auxilary Space - O(1)



import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] arr={3,4,1,9,56,7,9,12};
		int m=5;
		System.out.println(Solve(arr,m));
	}
	static int Solve(int[] arr,int m){
	    int n=arr.length;
	    Arrays.sort(arr);
	    int l=0,h=m-1;
	    int res=Integer.MAX_VALUE;
	    while(h<=n-1){
	        res=Math.min(res,Math.abs(arr[h]-arr[l]));
	        h++;
	        l++;
	    }
	    return res;
	}
	
}
