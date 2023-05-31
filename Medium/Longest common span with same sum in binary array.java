

//Time Complexity - O(n^2)
//Auxilary Space - o(1)




import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] arr={0,0,1,0};
		int[] arr1={1,1,1,1};
		System.out.println(Solve(arr,arr1));
	}
	static int Solve(int[] arr,int[] arr1){
	    int n=arr.length;
	    int res=0,preSum=0,preSum1=0;
	    for(int i=0;i<n;i++){
	        preSum=0;
	        preSum1=0;
	        for(int j=i;j<n;j++){
	            preSum+=arr[j];
	            preSum1+=arr1[j];
	            if(preSum==preSum1){
	                res=Math.max(res,(j-i)+1);
	            }
	        }
	    }
	    return res;
	} 
}
