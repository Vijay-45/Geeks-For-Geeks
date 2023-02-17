

//Time Complexity - O(n)
//Auxilary Space - O(1)

class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        long res=arr[0];
        int maxIndex=arr[0];
        for(int i=1;i<n;i++){
            maxIndex=Math.max(maxIndex+arr[i],arr[i]);
            res=Math.max(res,maxIndex);
        }
        return res;
        
    }
    
}


________________________________________________________________________________________________________________________________________________________________________

//Printing the Elements of the maximum subarray of the kadanes's algoritham.

//Time complexity - O(n)
//Auxilary Space  - O(1)



public class Main
{
	public static void main(String[] args) {
		int[] arr={-2,-5,6,-2,-3,1,5,-6};
		Solve(arr);
	}
	static void Solve(int[] arr){
	    int n=arr.length;
	    int end=0;
	    int curr=arr[0],global=arr[0];
	    
	    for(int i=1;i<n;i++){
	        curr=Math.max(curr+arr[i],arr[i]);
	        if(curr>global){
	            global=curr;
	            end=i;
	        }
	    }
	    
	    int start=end;
	    
	    
	    while(start>=0){
	        global-=arr[start];
	        if(global==0){
	            break;
	        }
	        start--;
	    }
	    
	    for(int j=start;j<=end;j++){
	        System.out.print(arr[j]+" ");
	    }
	}
}

