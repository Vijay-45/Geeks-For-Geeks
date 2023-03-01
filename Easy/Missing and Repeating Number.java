

//Time Complexity - O(n)
//Auxialry Space - O(1)


public class Main
{
	public static void main(String[] args) {
		int[] arr={2,3,2,1,5};
		Solve(arr);
	}
	public static void Solve(int[] arr){
	    int n=arr.length;
	    int rep=0,miss=0;
	    for(int i=0;i<n;i++){
	        int temp=arr[Math.abs(arr[i])-1];
	        if(temp<0){
	            rep=Math.abs(arr[i]);
	            break;
	        }
	        arr[Math.abs(arr[i])-1]=-arr[Math.abs(arr[i])-1];
	    }
	    for(int i=0;i<n;i++){
	        if(arr[i]>0){
	            miss=i;
	        }
	    }
	    System.out.println(rep+" "+miss);
	}
}
