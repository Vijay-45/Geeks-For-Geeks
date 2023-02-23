


//Time Complexity - O(n^2)
//Auxilary Space  - O(1)

public class Main
{
	public static void main(String[] args) {
		int[] arr={1,4,20,3,10,5};
		Solve(arr);
	}
	static void Solve(int[] arr){
	    int n=arr.length;
	    int sum=33;
	    int curr=0;
	    int end=0,start=0;
	    for(int i=0;i<n;i++){
	        curr=0;
	        for(int j=i;j<n;j++){
	            curr+=arr[j];
	            if(curr==sum){
	                System.out.println("Yes");
	                return;
	            }
	        }
	    }
	    System.out.println("No");
	}
}


//Time Complexity - O(n)
//Auxilary Space - O(1)


public class Main
{
	public static void main(String[] args) {
		int[] arr={4,8,12,5};
		Solve(arr);
	}
	static void Solve(int[] arr){
	    int n=arr.length;
	    int sum=17;
	    int s=0;
	    int curr=0;
	    for(int e=0;e<n;e++){
	        curr+=arr[e];
	        while(sum<curr){
	            curr-=arr[s++];
	        }
	        if(curr==sum){
	            System.out.println("yes");
	            return;
	        }
	    }
	    System.out.println("No");
	}
}
