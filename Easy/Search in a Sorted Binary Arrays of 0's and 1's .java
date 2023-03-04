

//Time Complexity - O(log(position))
//Auxilary Space - O(1)



public class Main
{
	public static void main(String[] args) {
		int[] arr={0,0,1,1,1,1,1,1,1,1,1};
		System.out.println(Solve(arr));
	}
	static int Solve(int[] arr){
	    if(arr[0]==1) return 0;
	    int i=1;
	    while(arr[i]<1){
	        i=i*2;
	    }
	    if(arr[i]==1 && arr[i-1]==0) return i;
	    
	    return BinarySearch(arr,(i/2)+1,i-1);
	}
	static int BinarySearch(int[] arr,int l,int h){
	    while(l<=h){
	        int mid=l+(h-l)/2;
	        if(arr[mid]==1 && arr[mid-1]==0) return mid;
	        else if(arr[mid]==1){
	            l=mid+1;
	        }
	        else{
	            h=mid-1;
	        }
	    }
	    return 0;
	}
}
