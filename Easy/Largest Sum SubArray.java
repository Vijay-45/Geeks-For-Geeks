
//Time Complexity - O(n)
//Auxilary Space - O(1)

public class Main
{
	public static void main(String[] args) {
		int[] arr={-7,1,5,2,-4,3,0};
		System.out.println(Solve(arr));
	}
	static int Solve(int[] arr){
	   int max=0;
	   int sum=0;
	   for(int i=0;i<arr.length;i++){
	       sum+=arr[i];
	       if(max<sum){
	           max=sum;
	       }
	       if(sum<0){
	           sum=0;
	       }
	   }
	   return max;
	}
}
