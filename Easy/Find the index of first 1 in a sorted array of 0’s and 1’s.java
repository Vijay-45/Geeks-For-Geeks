

//Time Complexity - O(Log(n))
//Auxilary Space - O(1)



public class Main
{
	public static void main(String[] args) {
	    int[] arr={0,0,0,0,0,0,1,1,1,1};
	    int n=arr.length;
	    System.out.println(First_Occurence(arr,n));
	}
	static int First_Occurence(int[] arr,int n){
	    int l=0,h=n-1;
	    while(l<=h){
	        int mid=l+(h-l)/2;
	        if((mid==0 ||arr[mid-1]==0) && arr[mid]==1 ){
	            return mid;
	        }
	        else if(arr[mid]==1){
	            h=mid-1;
	        }
	        else{
	            l=mid+1;
	        }
	    }
	    return 0;
	}
}
