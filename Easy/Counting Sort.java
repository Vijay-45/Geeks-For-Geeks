

//Time Complexity - O(n+k)
//Auxilary Space - O(k)

public class Main
{
	public static void main(String[] args) {
		int[] arr={4,4,2,1,0,2,3};
		int k=5;
		Solve(arr,k);
		for(int i:arr){
		    System.out.print(i+" ");
		}
	}
	static void Solve(int[] arr,int k){
	    int n=arr.length;
	    int[] count=new int[k];
	    for(int i=0;i<k;i++){
	        count[i]=0;
	    }
	    for(int i=0;i<n;i++){
	        count[arr[i]]++;
	    }
	    
	    int index=0;
	    for(int i=0;i<k;i++){
	        for(int j=0;j<count[i];j++){
	            arr[index]=i;
	            index++;
	        }
	    }
	}
}


____________________________________________________________________________________________________________________________


//Time Complxity - O(n+k)
//Auxilary Space - O(k)




public class Main
{
	public static void main(String[] args) {
	    int[] arr={1,0,1,0,4,4};
	    int k=5;
	    Solve(arr,k);
	    for(int i:arr){
	        System.out.print(i+" ");
	    }
	}
	static void Solve(int[] arr,int k){
	    int n=arr.length;
	    int[] count=new int[k];
	    for(int i=0;i<k;i++){
	        count[i]=0;
	    }
	    for(int i=0;i<n;i++){
	        count[arr[i]]++;
	    }
	    for(int i=1;i<k;i++){
	        count[i]=count[i-1]+count[i];
	    }
	    int[] output=new int[n];
	    for(int i=n-1;i>=0;i--){
	        output[count[arr[i]]-1]=arr[i];
	        count[arr[i]]--;
	    }
	    for(int i=0;i<n;i++){
	        arr[i]=output[i];
	    }
	}
}
