

//Time Complexity - O(Log(n))
//Auxialary Space - O(1)

public class Main
{
	public static void main(String[] args) {
	    int[] arr={1,1,2,2,2,2,3};
	    int k=2;
	    int n=arr.length;
	    int i=First_Occurence(arr,0,n-1,k,n);
	    int j=Last_Occurence(arr,0,n-1,k,n);
	    int res=j-i+1;
	    System.out.println(res);
	}
	static int First_Occurence(int[] arr,int l,int h,int k,int n){
	    while(l<=h){
	        int mid=l+(h-l)/2;
	        if((mid==0 || k>arr[mid-1]) && arr[mid]==k ){
	            return mid;
	        }
	        else if(k>arr[mid]){
	            l=mid+1;
	        }
	        else{
	            h=mid-1;
	        }
	    }
	    return 0;
	}
	static int Last_Occurence(int[] arr,int l,int h,int k,int n){
	    while(l<=h){
	        int mid=l+(h-l)/2;
	        if((mid==n-1 || k<arr[mid+1]) && arr[mid]==k){
	            return mid;
	        }
	        else if(k<arr[mid]){
	            h=mid-1;
	        }
	        else{
	            l=mid+1;
	        }
	    }
	    return 0;
	}
}
