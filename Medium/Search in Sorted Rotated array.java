

//Time Complexity - O(logn)
//Auxilary Space - O(1)


public class Main
{
	public static void main(String[] args) {
		int[] arr={100,200,400,1000,10,20,50,60,80};
		int x=400;
		System.out.println(Solve(arr,x));
	}
	static int Solve(int[] arr,int x){
	    int n=arr.length;
	   int l=0,h=n-1;
	   while(l<=h){
	       int mid=l+(h-l)/2;
	       if(arr[mid]==x) return mid;
	       else if(arr[mid]>=arr[l]){
	           if(x>=arr[l] && x<arr[mid]){
	               h=mid-1;
	           }
	           else{
	               l=mid+1;
	           }
	       }
	       else{
	           if(x<=arr[h] && x>arr[mid]){
	               l=mid+1;
	           }
	           else{
	               h=mid-1;
	           }
	       }
	   }
	   return -1;
	}
}
