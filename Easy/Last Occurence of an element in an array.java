

//Time Complexity - O(Logn)
//Auxilary Space - O(Logn)


public class Main
{
	public static void main(String[] args) {
	    int[] arr={1,10,10,10,20,20,40};
	    int n=arr.length;
	    int k=20;
	    System.out.println(Last_Occurence(arr,n,k,0,n-1));
	}
	static int Last_Occurence(int[] arr,int n,int k,int l,int h){
	     if(l>h){
	         return -1;
	     }
	     int mid=l+(h-l)/2;
	     if((mid==n-1 || k<arr[mid+1]) && arr[mid]==k){
	         return mid;
	     }
	     else if(k<arr[mid]){
	         return Last_Occurence(arr,n,k,l,mid-1);
	     }
	     else{
	         return Last_Occurence(arr,n,k,mid+1,h);
	     }
	}
}

_______________________________________________________________________________________________________________________________

//Time Complexity - O(Logn)
//Auxilary Space - O(1)

public class Main
{
	public static void main(String[] args) {
	    int[] arr={1,10,10,10,20,20,40};
	    int n=arr.length;
	    int k=20;
	    System.out.println(Last_Occurence(arr,n,k,0,n-1));
	}
	static int Last_Occurence(int[] arr,int n,int k,int l,int h){
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
