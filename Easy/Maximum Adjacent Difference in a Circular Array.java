

//Time Complexity -  o(n^2)
//Auxilary Space - O(1)


public class Main
{
	public static void main(String[] args) {
		int[] arr={10,-3,-4,7,6,5,-4,-1};
		Solve(arr);
	}
	static void Solve(int[] arr){
	    int n=arr.length;
	    int res=Math.abs(arr[0]-arr[1]);
	    int sum=0;
	    for(int i=1;i<n-1;i++){
	        for(int j=i+1;j<i+2;j++){
	            sum=Math.abs(arr[i]-arr[j]);
	            res=Math.min(res,sum);
	        }
	    }
	    sum=Math.abs(arr[n-1]-arr[0]);
	    res=Math.min(res,sum);
	    
	    
	    System.out.println(res);
	}
}

________________________________________________________________________________________________________________________________________________________________________


//Time Complexity - O(n)
//Auxilary Space - O(1)




class Solution{
    
    //Function to find minimum adjacent difference in a circular array.
    // arr[]: input array
    // n: size of array
    public static int minAdjDiff(int arr[], int n) {
        
        // Your code here
        int res=Math.abs(arr[0]-arr[1]);
        int sum=0;
        for(int i=1;i<n-1;i++){
            sum=Math.abs(arr[i]-arr[i+1]);
            res=Math.min(res,sum);
        }
        sum=Math.abs(arr[n-1]-arr[0]);
        res=Math.min(res,sum);
        
        
        return res;
    }
}
