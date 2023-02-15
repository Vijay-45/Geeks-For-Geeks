


//Time Complexity - O(n^2)
//Auxilary Space - O(1)


public class Main
{
	public static void main(String[] args) {
	    int[] arr={3,0,1,2,5};
	    Solve(arr);
	}
	static void Solve(int[] arr){
	    int n=arr.length;
	    int res=0;
	    for(int i=1;i<n-1;i++){
	        int lmax=arr[i];
	        for(int j=0;j<i;j++){
	            lmax=Math.max(lmax,arr[j]);
	        }
	        int rmax=arr[i];
	        for(int k=i+1;k<n;k++){
	            rmax=Math.max(rmax,arr[k]);
	        }
	        res+=Math.min(lmax,rmax)-arr[i];
	    }
	    System.out.println(res);
	}
}
________________________________________________________________________________________________________________________________________________________________________

//Time Complexity - O(n)
//Auxilary Space - O(n)


public class Main
{
	public static void main(String[] args) {
	    int[] arr={3,0,1,2,5};
	    Solve(arr);
	}
	static void Solve(int[] arr){
	   int n=arr.length;
	   int[] lmax=new int[n];
	   int[] rmax=new int[n];
	   int res=0;
	   lmax[0]=arr[0];
	   for(int i=1;i<n;i++){
	       lmax[i]=Math.max(arr[i],lmax[i-1]);
	   }
	   rmax[n-1]=arr[n-1];
	   for(int j=n-2;j>=0;j--){
	       rmax[j]=Math.max(arr[j],rmax[j+1]);
	   }
	   for(int k=1;k<n-1;k++){
	       res=res+(Math.min(rmax[k],lmax[k])-arr[k]);
	   }
	   
	   
	  System.out.println(res+" ");
	}
}
