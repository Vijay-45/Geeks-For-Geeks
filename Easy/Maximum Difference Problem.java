

//Time Complexity - O(n^2)
//Auxilary Space - O(1)


public class Main
{
	public static void main(String[] args) {
	    int[] arr={30,20,10};
	    Solve(arr);
	}
	static void Solve(int[] arr){
	    int n=arr.length;
	    int ans=arr[1]-arr[0];
	    for(int i=0;i<n-1;i++){
	        for(int j=i+1;j<n;j++){
	            ans=Math.max(ans,arr[j]-arr[i]);
	        }
	    }
	    System.out.println(ans);
	}
}

________________________________________________________________________________________________________________________________________________________________________

//Time Complexity - O(n)
//Auxilary Space - O(1)

public class Main
{
	public static void main(String[] args) {
	    int[] arr={2,3,10,6,5,8,1};
	    Solve(arr);
	}
	static void Solve(int[] arr){
	    int n=arr.length;
	    int ans=arr[1]-arr[0];
	    int min_val=arr[0];
	    for(int i=1;i<n;i++){
	        ans=Math.max(ans,arr[i]-min_val);
	        min_val =Math.min(min_val,arr[i]);
	    }
	    System.out.println(ans);
	}
}
