

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
	        else if(mid>0 && arr[mid-1]>=arr[mid]){
	            h=mid-1;
	        }
	        else{
	            l=mid+1;
	        }
	    }
	    return 0;
	}
}


______________________________________________________________________________________________________________________________


//Time Complexity - O(n)
//Auxilary Space - O(1)




public class Main
{
	public static void main(String[] args) {
		int[] arr={80,70,90};
		System.out.println(Solve(arr));
	}
	static int Solve(int[] arr){
	    int n=arr.length;
	    if(n==1) return arr[0];
	    if(arr[0]>=arr[1]) return arr[0];
	    if(arr[n-1]>=arr[n-2]) return arr[n-1];
	    for(int i=1;i<n-1;i++){
	        if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1]){
	            return arr[i];
	        }
	    }
	    return -1;
	    
	}
}
