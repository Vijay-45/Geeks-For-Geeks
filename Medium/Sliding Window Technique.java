

//Time Complexity - O(n*k)
//Auxilary Space - O(1)

public class Main
{
	public static void main(String[] args) {
	    int[] arr={1,8,30,-5,20,7};
	    Solve(arr);
	}
	static void Solve(int[] arr){
	    int n=arr.length;
	    int sum=0;
	    int res=0;
	    int k=3;
	    for(int i=0;i<n-(k-1);i++){
	        sum=0;
	        for(int j=i;j<i+k;j++){
	            sum+=arr[j];
	            res=Math.max(sum,res);
	        }
	    }
	    System.out.print(res);
	}
}
________________________________________________________________________________________________________________________________________________________________________

//Time Complexity - O(n)
//Auxilary Space -  O(1)


public class Main
{
	public static void main(String[] args) {
	    int[] arr={1,8,30,-5,20,7};
	    Solve(arr);
	}
	static void Solve(int[] arr){
	 int n=arr.length;
	 int k=3;
	 int sum=0;
	 for(int i=0;i<k;i++){
	     sum+=arr[i];
	 }
	 int res=sum;
	 for(int i=k;i<n;i++){
	     sum=sum+arr[i]-arr[i-k];
	     res=Math.max(res,sum);
	 }
	 System.out.print(res);
	}
}
