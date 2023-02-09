
//Time Complexity - O(n^2)
//Auxilary Space - O(1)

public class Main
{
	public static void main(String[] args) {
	    int[] arr={7,10,4,10,6,5,2};
	    Solve(arr);
	}
	static void Solve(int[] arr){
	    int n=arr.length;
	    boolean flag;
	    for(int i=0;i<n;i++){
	        flag=false;
	        for(int j=i+1;j<n;j++){
	            if(arr[i]<=arr[j]){
	                flag=true;
	                break;
	            }
	        }
	        if(!flag){
	            System.out.print(arr[i]+" ");
	        }
	    }
	}
	
}
_______________________________________________________________________________________________________________________________________________________________________


//Time Complexity - O(n)
//Space Complexity - O(1)

public class Main
{
	public static void main(String[] args) {
	    int[] arr={7,10,4,10,6,5,2};
	    Solve(arr);
	}
	static void Solve(int[] arr){
	    int n=arr.length;
	    int curr=arr[n-1];
	    System.out.print(curr+" ");
	    for(int i=n-2;i>=0;i--){
	        if(curr<arr[i]){
	            curr=arr[i];
	            System.out.print(curr+" ");
	        }
	    }
	    
	}
	
}
