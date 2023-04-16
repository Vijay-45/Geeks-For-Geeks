//Time Complexity - O(n)
//Auxilary Space - O(1)





public class Main
{
	public static void main(String[] args) {
		int[] arr={12,35,1,10,34,1};
		int n=arr.length;
		System.out.println(Solve(arr,n));
	}
	static int Solve(int[] arr,int n){
	    int Fmx=arr[0];
	    int Smx=-1;
	    for(int i=1;i<n;i++){
	        if(arr[i]>Fmx){
	            Smx=Fmx;
	            Fmx=arr[i];
	        }
	        if(arr[i]<Fmx){
	            Smx=Smx>arr[i]?Smx:arr[i];
	        }
	    }
	    return Smx;
	}
	
}
