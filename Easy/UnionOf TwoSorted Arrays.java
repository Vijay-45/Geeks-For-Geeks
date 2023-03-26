

//Time Complexity - O((m+n)*log(m+n))
//Auxilary Space - O(m+n)



import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] arr = {3,5,8};
		int[] arr1 = {2,8,9,10,15};
		Solve(arr,arr1);
 	}
 	static void Solve(int[] arr,int[] arr1){
 	    int n=arr.length;
 	    int n1 =arr1.length;
 	    int[] res=new int[n+n1];
 	    for(int i=0;i<n;i++){
 	        res[i]=arr[i];
 	    }
 	    for(int i=0;i<n1;i++){
 	        res[i+n]=arr1[i];
 	    }
 	    Arrays.sort(res);
 	    for(int i=0;i<res.length;i++){
 	        if(i==0 || res[i]!=res[i-1]){
 	            System.out.print(res[i]+" ");
 	        }
 	    }
 	}
}
