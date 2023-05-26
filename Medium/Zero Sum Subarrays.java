

//Time Complexity - O(n^2)
//Auxilary Space - O(1)



import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] arr={6,-1,-3,4,-2,2,4,6,-12,-7};
		System.out.println(Solve(arr));
	}
	static int Solve(int[] arr){
	    int n=arr.length;
	    int count=0,sum=0;
	    for(int i=0;i<n;i++){
	        sum=0;
	        for(int j=i;j<n;j++){
	            sum+=arr[j];
	            if(sum==0){
	                count++;
	            }
	        }
	    }
	    return count;
	}
}
