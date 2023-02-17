

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
