

//Time Complexity - O(n)
//Auxilary Space - O(1)


public class Main
{
	public static void main(String[] args) {
		int[] arr={40,50,50,50};
		Solve(arr);
	}
	static void Solve(int[] arr){
	    int n=arr.length;
	    int count=1;
	    for(int i=0;i<n-1;i++){
	        if(arr[i]==arr[i+1]){
	            count++;
	        }
	        if(arr[i]!=arr[i+1]){
	            System.out.println(arr[i]+" "+count);
	            count=1;
	        }
	    }
	    System.out.println(arr[n-1]+" "+count);
	}
}
