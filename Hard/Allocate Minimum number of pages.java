

//Time Complexity - O(n^k*k)
//Space Complexity - O(k)


public class Main
{
	public static void main(String[] args) {
		int[] arr={10,20,30,40};
		int n=arr.length;
		int k=3;
		System.out.println(Solve(arr,n,k));
	}
	static int Solve(int[] arr,int n,int k){
	    if(k==1){
	        return Sum(arr,0,n-1);
	    }
	    if(n==1){
	        return arr[0];
	    }
	    int res=Integer.MAX_VALUE;
	    for(int i=1;i<n;i++){
	        res=Math.min(res,Math.max(Solve(arr,i,k-1),Sum(arr,i,n-1)));
	    }
	    return res;
	}
	static int Sum(int[] arr,int s,int e){
	    int sum=0;
	    for(int i=s;i<=e;i++){
	        sum+=arr[i];
	    }
	    return sum;
	}
}
______________________________________________________________________________________________________________________________


//Time Complexity - O(nlogn)
//Auxialry Space - O(1)


public class Main
{
	public static void main(String[] args) {
		int[] arr={10,20,30,40};
		int n=arr.length;
		int k=3;
		System.out.println(Solve(arr,n,k));
	}
	static int Solve(int[] arr,int n,int k){
	  int sum=0,mx=0;
	  for(int i=0;i<n;i++){
	      sum+=arr[i];
	      mx=Math.max(arr[i],mx);
	  }
	  int low=mx,high=sum,res=0;
	  
	  while(low<=high){
	      int mid=low+(high-low)/2;
	      if(isFeasible(arr,n,mid,k)){
	          res=mid;
	          high=mid-1;
	      }
	      else{
	          low=mid+1;
	      }
	  }
	  return res;
	}
	static boolean isFeasible(int[] arr,int n,int k,int ans){
	    int req=1,sum=0;
	    for(int i=0;i<n;i++){
	        if((sum+arr[i]) > ans){
	            req++;
	            sum=arr[i];
	        }
	        else{
	            sum+=arr[i];
	        }
	    }
	    return (req<=k);
	}
}
