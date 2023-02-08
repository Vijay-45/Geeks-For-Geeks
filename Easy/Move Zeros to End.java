

//Time Complexity - O(n)
//Auxilary Space - O(1)


public class Main
{
	public static void main(String[] args) {
		int[] arr={8,5,0,10,0,20};
		Solve(arr);
	}
	static void Solve(int[] arr){
	    int n=arr.length;
	    int temp=0;
	    int count=0;
	    for(int i=0;i<n;i++){
	        if(arr[i]!=0){
	            temp=arr[i];
	            arr[i]=arr[count];
	            arr[count]=temp;
	            count++;
	        }
	    }
	    for(int k:arr){
	        System.out.print(k+" ");
	    }
	}
}

