

//Time Complexity - O(n^2)
//Auxilary Space - O(1)





import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] arr={2,5,8,10,11,12,14};
		System.out.println(Solve(arr));
	}
	static int Solve(int[] arr){
	   int n=arr.length;
	   int i=n-1;
	   int count=0;
	   Arrays.sort(arr);
	   while(i>=2){
	       int l=0;
	       int h=i-1;
	       while(l<h){
	           int sum = arr[l]+arr[h];
	           if(sum==arr[i]){
	               count++;
	               l++;
	               h--;
	           }
	           else if(sum>arr[i]){
	               h--;
	           }
	           else{
	               l++;
	           }
	       }
	       i--;
	   }
	   return count;
	}
}
