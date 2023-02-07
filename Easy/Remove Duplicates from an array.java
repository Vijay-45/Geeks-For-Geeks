
//Time Complexity - O(n)
//Space Complexity - O(1)


public class Main
{
	public static void main(String[] args) {
	    int[] arr={10,20,20,30,30,30};
	    Solve(arr);
	}
	static void Solve(int[] arr){
	    int n=arr.length;
	    
	    int res=1;
	    for(int i=1;i<n;i++){
	        if(arr[i]!=arr[res-1]){
	            arr[res]=arr[i];
	            res++;
	        }
	    }
	    System.out.println(res);
	}
}
