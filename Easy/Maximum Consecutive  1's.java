

//Time Complexity - O(n^2)
//Auxilary Space - O(1)


public class Main
{
	public static void main(String[] args) {
		int[] arr={0,1,1,1,0,1,1,0};
		Solve(arr);
	}
	static void Solve(int[] arr){
	    int n=arr.length;
	    int res=0;
	    for(int i=0;i<n;i++){
	        int count=0;
	        for(int j=i;j<n;j++){
	            if(arr[j]==1) count++;
	            else{
	                break;
	            }
	        }
	        res=Math.max(res,count);
	    }
	    System.out.println(res);
	}
}

________________________________________________________________________________________________________________________________________________________________________

//Time Complexity - O(n)
//Auxilary Space - O(1)


public class Main
{
	public static void main(String[] args) {
		int[] arr={0,1,1,1,0,1,1,0};
		Solve(arr);
	}
	static void Solve(int[] arr){
	   int n=arr.length;
	   int res=0,count=0;
	   for(int i=0;i<n;i++){
	       if(arr[i]==0){
	           count=0;
	       }
	       else{
	           count++;
	           res=Math.max(res,count);
	       }
	   }
	    System.out.println(res);
	}
}
