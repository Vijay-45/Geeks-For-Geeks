

//Time Complexity - O(d*(n+k))
//Auxilary Space - O(n+k)



import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] arr={319,212,6,8,100,50};
		Solve(arr);
		for(int i:arr){
		    System.out.print(i+" ");
		}
	}
	static void Solve(int[] arr){
	    int n=arr.length;
	    int mx=0;
	    for(int i=0;i<n;i++){
	        mx=Math.max(mx,arr[i]);
	    }
	    for(int i=1;(mx/i)>0;i=i*10){
	        CountingSort(arr,mx,i);
	    }
	}
	static void CountingSort(int[] arr,int mx,int exp){
	    int n=arr.length;
	    int[] count=new int[10];
	    int[] output=new int[n];
	    Arrays.fill(count,0);
	    for(int i=0;i<n;i++){
	        count[(arr[i]/exp)%10]++;
	    }
	    for(int i=1;i<10;i++){
	        count[i]=count[i-1]+count[i];
	    }
	    for(int i=n-1;i>=0;i--){
	        output[count[(arr[i]/exp)%10]-1]=arr[i];
	        count[(arr[i]/exp)%10]--;
	    }
	    for(int i=0;i<n;i++){
	        arr[i]=output[i];
	    }
	}
}
