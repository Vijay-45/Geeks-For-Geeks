

//Time Complexity - O(nlogn)
//Auxilary Space - O(1)




import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] arr={900,940};
		int[] dep={1000,1030};
		System.out.println(Solve(arr,dep));
	}
	static int Solve(int[] arr,int[] dep){
	    int n=arr.length;
	    Arrays.sort(arr);
	    Arrays.sort(dep);
	    int i=1,j=0,res=1,count=1;
	    while(i<n && j<n){
	        if(arr[i]<=dep[j]){
	            count++;i++;
	        }
	        else{
	            count--;j++;
	        }
	        res=Math.max(res,count);
	    }
	    
	    return count;
	}
}
