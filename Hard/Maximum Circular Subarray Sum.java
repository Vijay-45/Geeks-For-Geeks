

//Time Complexity - O(n^2)
//Auxilary Space - O(1)


public class Main
{
	public static void main(String[] args) {
		int[] arr={5,-2,3,4};
		Solve(arr);
	}
	static void Solve(int[] arr){
	  int n=arr.length;
	  int maxI;
	  int res=arr[0];
	  for(int i=0;i<n;i++){
	      maxI=0;
	      for(int j=i;j<n;j++){
	          int index=(i+j)%n;
	          maxI+=arr[index];
	          res=Math.max(res,maxI);
	      }
	  }
	  System.out.println(res);
	}
}
_________________________________________________________________________________________________________________________________________________________________________


//Time Complexity - O(n)
//Auxilary Space - O(1)


class Solution{

    // a: input array
    // n: size of array
    //Function to find maximum circular subarray sum.
    static int circularSubarraySum(int a[], int n) {
        
        // Your code here
        int Max=Kadane(a,n);
        if(Max<0){
            return Max;
        }
        
        return Integer.max(Kadane(a,n), reverseKadane(a,n));
    }
    static int Kadane(int[] arr,int n){
        int curr=arr[0];
        int res=arr[0];
        for(int i=1;i<n;i++){
            curr=Math.max(curr+arr[i],arr[i]);
            res=Math.max(res,curr);
        }
        return res;
    }
    static int reverseKadane(int[] arr,int n){
        int arr_sum=0;
        for(int i=0;i<n;i++){
            arr_sum+=arr[i];
            arr[i]=-arr[i];
        }
        int Min_Sum=arr_sum+Kadane(arr,n);
        
        return Min_Sum;
    }
    
}


