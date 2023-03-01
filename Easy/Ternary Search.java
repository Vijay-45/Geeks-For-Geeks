

//Time Complexity - O(Logn base 3)
//Auxilary Space - O(1)


public class Main
{
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6,7,8,9};
		int k=6;
		System.out.println(Solve(arr,k));
	}
	public static int Solve(int[] arr,int k){
	    int n=arr.length;
	    int l=0,h=n-1;
	    while(l<=h){
	        int mid1=l+(h-l)/3;
	        int mid2=h-(h-l)/3;
	        
	        if(arr[mid1]==k){
	            return mid1;
	        }
	        if(arr[mid2]==k){
	            return mid2;
	        }
	        if(k<arr[mid1]){
	            h=mid1-1;
	        }
	        else if(k>arr[mid2]){
	            l=mid2+1;
	        }
	        else{
	            l=mid1+1;
	            h=mid2-1;
	        }
	    }
	    return -1;
	}
}
