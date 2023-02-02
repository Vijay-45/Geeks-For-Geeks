//Time Complexity - O(m+n)
//Auxilary Space - O(m+n)


public class Main
{
	public static void main(String[] args) {
	    int[] arr={1,3,4,6};
	    int[] arr1={2,5,7,8};
	    int n=arr.length;
	    int m=arr1.length;
	    Solve(arr,arr1,n,m);
	}
	static void Solve(int[] arr,int[] arr1,int n,int m){
	    int[] res=new int[n+m];
	    int i=0,j=0,k=0;
	    while(i<n && j<m){
	        if(arr[i]<arr1[j]){
	            res[k++]=arr[i++];
	        }
	        else{
	            res[k++]=arr1[j++];
	        }
	    }
	    while(i<n){
	        res[k++]=arr[i++];
	    }
	    while(j<m){
	        res[k++]=arr1[j++];
	    }
	    
	    
	    for(int p:res){
	        System.out.print(p+" ");
	    }
	}
}
