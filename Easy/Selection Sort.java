

//Time Complexity - O(n^2)
//Auxilary Space - O(1)


public class Main
{
	public static void main(String[] args) {
	    int[] arr={64,25,12,22,11};
	    Solve(arr);
	}
	static void Solve(int[] arr){
	    int n=arr.length;
	    int min=0,temp=0;
	    for(int i=0;i<n;i++){
	        min=i;
	        for(int j=i+1;j<n;j++){
	            if(arr[min]>arr[j]){
	                temp=arr[j];
	                arr[j]=arr[min];
	                arr[min]=temp;
	            }
	        }
	    }
	    for(int i:arr){
	        System.out.print(i+" ");
	    }
	}
}
