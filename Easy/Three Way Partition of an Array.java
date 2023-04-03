

//Time Complexity - O(n)
//Auxilary Space - O(n)



class Solution{
    //Function to partition the array around the range such 
    //that array is divided into three parts.
    public void threeWayPartition(int arr[], int a, int b)
    {
        // code here 
        int n=arr.length;
        int[] temp=new int[n];
        
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i]<a){
                temp[index++]=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]>=a && arr[i]<=b){
                temp[index++]=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]>b){
                temp[index++]=arr[i];
            }
        }
        
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
    }
}

______________________________________________________________________________________________________________________________



//Time Complexity - O(n)
//Auxilary Space - O(1)




public class Main
{
	public static void main(String[] args) {
		int[] arr = {2,4,1,3,5};
		int a=2;
		int b=4;
		Solve(arr,a,b);
	}
	static void Solve(int[] arr,int a,int b){
	    int n=arr.length;
	    int l=-1,h=n;
	    int temp=0;
	    for(int i=0;i<n;i++){
	        if(arr[i]<a){
	            l++;
	            temp=arr[i];
	            arr[i]=arr[l];
	            arr[l]=temp;
	        }
	    }
	    for(int i=n-1;i>=0;i--){
	        if(arr[i]>b){
	            h--;
	            temp=arr[i];
	            arr[i]=arr[h];
	            arr[h]=temp;
	        }
	    }
	    
	    for(int i:arr){
	        System.out.print(i+" ");
	    }
	}
}
