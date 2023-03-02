

//Time Complexity - O(Log(n))
//Auxialry Space - O(1)



public class Main
{
	public static void main(String[] args) {
	    int[] arr={10,23,15,2,23,90,67};
	    int n=arr.length;
	    System.out.println(First_Occurence(arr,n));
	}
	static int First_Occurence(int[] arr,int n){
	    int l=0,h=n-1;
	    while(l<=h){
	        int mid=l+(h-l)/2;
	        if((mid==0 || arr[mid-1]<=arr[mid]) && (mid==n-1 || arr[mid+1]<=arr[mid])){
	            return mid;
	        }
	        else if(mid>0 && arr[mid-1]>arr[mid]){
	            h=mid-1;
	        }
	        else{
	            l=mid+1;
	        }
	    }
	    return 0;
	}
}
