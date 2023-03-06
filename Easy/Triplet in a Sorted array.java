

//Time Complexity - O(n^2)
//Auxilary Space - O(1)




public class Main
{
	public static void main(String[] args) {
		int[] arr={2,3,4,8,9,20,40};
		int k=32;
		System.out.println(Solve(arr,k));
	}
	public static boolean Solve(int[] arr,int p){
	    int n=arr.length;
	   int l=0,r=n-1;
	   for(int i=0;i<n;i++){
	       l=i+1;
	       while(l<r){
	           if((arr[i]+arr[l]+arr[r])==p){
	               return true;
	           }
	           else if((arr[i]+arr[l]+arr[r]) >p){
	               r--;
	           }
	           else{
	               l++;
	           }
	       }
	   }
	   return false;
	} 
}
______________________________________________________________________________________________________________________________


//Time Complexity - O(n^2)
//Auxilary Space - O(1)




public class Main
{
	public static void main(String[] args) {
		int[] arr={2,3,4,8,9,20,40};
		int k=32;
		System.out.println(Solve(arr,k));
	}
	public static boolean Solve(int[] arr,int p){
	    int n=arr.length;
	   for(int i=0;i<n;i++){
	     if(isPairSum(arr,p-arr[i],n,i+1)){
	         return true;
	     }
	   }
	   return false;
	} 
	public static boolean isPairSum(int[] arr,int x,int n,int l){
	    int r=n-1;
	    while(l<r){
	        if((arr[l]+arr[r])==x){
	            return true;
	        }
	        else if((arr[l]+arr[r]) > x){
	            r--;
	        }
	        else{
	            l++;
	        }
	    }
	    return false;
	}
}
