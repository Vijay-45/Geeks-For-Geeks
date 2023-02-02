
//Equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.

//Naive Solution 

//Time Complexity - O(n^2)
//Auxilary Space - O(1)

public class Main
{
	public static void main(String[] args) {
		int[] arr={-7,1,5,2,-4,3,0};
		System.out.println(Solve(arr));
	}
	static int Solve(int[] arr){
	    int lefsum,rightsum;
	    for(int i=0;i<arr.length;i++){
	        lefsum=0;
	        for(int j=0;j<i;j++){
	            lefsum+=arr[j];
	        }
	        rightsum=0;
	        for(int j=i+1;j<arr.length;j++){
	            rightsum+=arr[j];
	        }
	        
	        if(lefsum==rightsum){
	            return i;
	        }
	    }
	    return 0;
	}
}

//Effiecient Solution

//Time Complexity - O(n)
//Auxilary Space - O(1)

public class Main
{
	public static void main(String[] args) {
		int[] arr={-7,1,5,2,-4,3,0};
		System.out.println(Solve(arr));
	}
	static int Solve(int[] arr){
	   int sum=0,leftsum=0;
	   for(int i=0;i<arr.length;i++){
	       sum+=arr[i];
	   }
	   for(int j=0;j<arr.length;j++){
	       sum-=arr[j];
	       if(sum==leftsum){
	           return j;
	       }
	       leftsum+=arr[j];
	   }
	   return 0;
	}
}


