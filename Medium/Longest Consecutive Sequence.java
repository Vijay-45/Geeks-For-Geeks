

//Time Complexity - O(nlogn)
//Auxilary Space - O(1)



import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] arr={1,9,3,4,2,10};
		System.out.println(Solve(arr));
	}
	static int Solve(int[] arr){
	    int n=arr.length;
	    int res=1,curr=1;;
	    Arrays.sort(arr);
	    for(int i=1;i<n;i++){
	        if(arr[i]-arr[i-1]==1){
	            curr++;
	        }
	        else if(arr[i]!=arr[i-1]){
	            res=Math.max(res,curr);
	            curr=1;
	        }
	    }
	    return Math.max(res,curr);
	}
}
