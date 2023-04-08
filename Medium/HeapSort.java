

//Time Complexity - O(nlogn)
//Auxilary Space - O(1)



public class Main
{
	public static void main(String[] args) {
		int[] arr={4,10,3,1,5};
		HeapSort(arr);
		
		for(int i:arr){
		    System.out.print(i+" ");
		}
	}
	static void HeapSort(int[] arr){
	    int n=arr.length;
	    for(int i=(n-1)/2;i>=0;i--){
	        Heapify(arr,n,i);
	    }
	    
	    for(int i=n-1;i>=0;i--){
	        int temp=arr[0];
	        arr[0]=arr[i];
	        arr[i]=temp;
	        
	        Heapify(arr,i,0);
	    }
	    
	}
	static void Heapify(int[] arr,int n,int i){
	    int large = i;
	    int left=2*i+1;
	    int right=2*i+2;
	    
	    
	    if(left<n && arr[left]>arr[large]){
	        large=left;
	    }
	    if(right<n && arr[right]>arr[large]){
	        large=right;
	    }
	    if(large!=i){
	        int temp=arr[i];
	        arr[i]=arr[large];
	        arr[large]=temp;
	        
	        Heapify(arr,n,large);
	    }
	}
	
	
	
}
