

//Time Complexity - O(n)
//Auxialry Space - O(1)



public class Main
{
	public static void main(String[] args) {
		int[] arr={1,3,2,4,3,3};
		System.out.println(Solve(arr));
	}
	static int Solve(int[] arr){
	    int n=arr.length;
	    int s=arr[0],f=arr[0];
	    do{
	       s=arr[s];
	       f=arr[arr[f]];
	    }
	    while(s!=f);
	    
	    s=arr[0];
	    while(s!=f){
	        s=arr[s];
	        f=arr[f];
	    }
	    return s;
	}
}
