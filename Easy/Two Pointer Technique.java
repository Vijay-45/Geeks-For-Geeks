

//Time Complexity - O(n)
//Auxialary Space - O(1)

public class Main
{
	public static void main(String[] args) {
		int[] arr={2,4,8,9,11,12,20,30};
		int x=23;
		System.out.println(Solve(arr,x));
	}
	static boolean Solve(int[] arr,int x){
	  int n=arr.length;
	  int l=0,r=n-1;
	  while(l<r){
	      if((arr[l]+arr[r])==x){
	          return true;
	      }
	      else if((arr[l]+arr[r])>x){
	          r--;
	      }
	      else{
	          l++;
	      }
	  }
	  return false;
	 

	}
}
