

//Time Complexity - O(n^2)
//Auxilary Space - O(1)


public class Main
{
	public static void main(String[] args) {
		int[] arr = {40,30,20,10};
		System.out.println(Solve(arr));
	}
	static int Solve(int[] arr){
	    int n=arr.length;
	    int res = 0;
	    for(int i=0;i<n;i++){
	        for(int j=i+1;j<n;j++){
	            if((i<j) && (arr[i]>arr[j])){
	                res++;
	            }
	        }
	    }
	    return res;
	    
	}
}


______________________________________________________________________________________________________________________________



//Time Complexity - O(nlogn)
//Auxilary Space - O(n)




class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long n)
    {
        // Your Code Here
        int l=0,r=(int)n-1;
        long res = MergeSort(arr,l,r);
        return res;
    }
    static long MergeSort(long[] arr,int l,int r){
        long res=0;
        if(l<r){
            int mid=l+(r-l)/2;
            res+=MergeSort(arr,l,mid);
            res+=MergeSort(arr,mid+1,r);
            res+=CountAndMerge(arr,l,mid,r);
        }
        return res;
    }
    static long CountAndMerge(long[] arr,int l,int m,int r){
        int n1=m-l+1,n2=r-m;
        long[] left=new long[n1];
        long[] right=new long[n2];
        for(int i=0;i<n1;i++){
            left[i]=arr[i+l];
        }
        for(int i=0;i<n2;i++){
            right[i]=arr[m+1+i];
        }
        int i=0,j=0,k=l;
        long res=0;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k++]=left[i++];
            }
            else{
                arr[k++]=right[j++];
                res+=(n1-i);
            }
        }
        while(i<n1){
            arr[k++]=left[i++];
        }
        while(j<n2){
            arr[k++]=right[j++];
        }
        
        return res;
    }
}
