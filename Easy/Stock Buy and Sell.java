

//Time Complexity - O(n^2)
//Auxilary Space - O(n)

public class Main
{
	public static void main(String[] args) {
		int[] arr={1,5,3,8,12};
		int s=0;
		int e=arr.length-1;
		System.out.println(Solve(arr,s,e));
	}
	static int Solve(int[] arr,int s,int e){
	    if(e<=s) return 0;
	    int p=0;
	    for(int i=s;i<e;i++){
	        for(int j=i+1;j<=e;j++){
	            if(arr[j]>arr[i]){
	                int curr=arr[j]-arr[i]+Solve(arr,s,i-1)+Solve(arr,j+1,e);
	                p=Math.max(curr,p);
	            }
	        }
	    }
	    return p;
	    
	}
}
_______________________________________________________________________________________________________________________________________________________________________

//Time Complexity - O(n)
//Auxilary Space - O(1)

public class Main
{
	public static void main(String[] args) {
		int[] arr={1,5,3,8,12};
		System.out.println(Solve(arr));
	}
	static int Solve(int[] arr){
	  int n=arr.length;
	  int p=0;
	  for(int i=1;i<n;i++){
	      if(arr[i]>arr[i-1]){
	          p+=(arr[i]-arr[i-1]);
	      }
	  }
	  return p;
	    
	}
}
_____________________________________________________________________________________________________________________________________________________________________

//Time Complexity - O(n)
//Auxilary Space - O(n)

class Solution{
    //Function to find the days of buying and selling stock for max profit.
    ArrayList<ArrayList<Integer> > stockBuySell(int arr[], int n) {
        // code here
        ArrayList<ArrayList<Integer>> x=new ArrayList<ArrayList<Integer>>();
	    int s=0,e=0;
	    boolean flag=false;
	    for(int i=1;i<n;i++){
	        if(arr[i]==arr[i-1]){
	            continue;
	        }
	        if(arr[i]<arr[i-1] && flag==false){
	            continue;
	        }
	        if(arr[i]>arr[i-1] && flag==true){
	            e=i;
	        }
	        if(arr[i]>arr[i-1] && flag==false){
	            s=i-1;
	            e=i;
	            flag=true;
	        }
	        if(arr[i]<arr[i-1] && flag==true){
	            flag=false;
	            e=i-1;
	            x.add(new ArrayList<Integer>(Arrays.asList(s,e)));
	        }
	        if(e==n-1){
	            x.add(new ArrayList<Integer>(Arrays.asList(s,n-1)));
	        }
	    }
	    return x;
    }
}

