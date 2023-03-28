

//Time Complexity - O(n)
//Auxilary Space - O(n)


public class Main
{
	public static void main(String[] args) {
		int[] arr={5,13,8,6,9,12,11};
		Solve(arr);
	}
	static void Solve(int[] arr){
	    int n=arr.length;
	    int p=2;
	    int l=0,h=n-1,index=0;
	    int[] temp=new int[n];
	    for(int i=l;i<n;i++){
	        if(arr[i]<arr[p]){
	            temp[index++]=arr[i];
	        }
	    }
	    temp[index++]=arr[p];
	    for(int i=l;i<n;i++){
	        if(arr[i]>arr[p]){
	            temp[index++]=arr[i];
	        }
	    }
	    
	    for(int j:temp){
	        System.out.print(j+" ");
	
	        
	    }
	}
}
