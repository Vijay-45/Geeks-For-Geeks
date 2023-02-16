

//Time Complexity - O(n^2)
//Auxilary Space - O(1)


public class Main
{
	public static void main(String[] args) {
		int[] arr={-6,-1,-8};
		Solve(arr);
	}
	static void Solve(int[] arr){
	    int n=arr.length;
	    int res=arr[0];
	    int sum;
	    for(int i=0;i<n;i++){
	        sum=0;
	        for(int j=i;j<n;j++){
	            sum=sum+arr[j];
	            res=Math.max(res,sum);
	        }
	    }
	    System.out.println(res);
	}
}

________________________________________________________________________________________________________________________________________________________________________


//Maxium subarray Sum of the current Element  = Max(Maximum Subarray sum of the previous element  + current Element, Current Element)

//Time Complexity - O(n)
//Auxilary Space - O(1)



public class Main
{
	public static void main(String[] args) {
		int[] arr={-5,-1,-2};
		Solve(arr);
	}
	static void Solve(int[] arr){
	  int n=arr.length;
	  int res=arr[0];
	  int maxIndex=arr[0];
	  for(int i=1;i<n;i++){
	      maxIndex=Math.max(maxIndex+arr[i],arr[i]);
	      res=Math.max(res,maxIndex);
	  }
	  System.out.println(res);
	}
}
