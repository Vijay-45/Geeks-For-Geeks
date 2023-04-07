

//Time Complexity - O(n^2)
//Auxilary Space - O(1)



public class Main
{
	public static void main(String[] args) {
		int[] arr={20,40,50,10};
		Solve(arr);
	}
	static void Solve(int[] arr){
	    int n=arr.length;
	    for(int i=0;i<n-1;i++){
	        int item = arr[i];
	        int pos=i;
	        for(int j=i+1;j<n;j++){
	            if(arr[j]<item){
	                pos++;
	            }
	        }
	        int temp=item;
	        item=arr[pos];
	        arr[pos]=temp;
	        
	        while(i!=pos){
	            pos=i;
	            for(int j=i+1;j<n;j++){
	                if(arr[j]<item){
	                    pos++;
	                }
	            }
	            temp=item;
	            item=arr[pos];
	            arr[pos]=temp;
	        }
	    }
	    
	    for(int k:arr){
	        System.out.print(k+" ");
	    }
	  
	}
}
