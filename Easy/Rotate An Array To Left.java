
//Time Complexity - O(n)
//Auxilary Space - O(1)



class Solution
{
    //Function to rotate an array by d elements in counter-clockwise direction. 
    static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
       d=d%n;
       Reverse(arr,0,d-1);
       Reverse(arr,d,n-1);
       Reverse(arr,0,n-1);
    }
    static void Reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}

_____________________________________________________________________________________________________________________________________________________________________

//Time Complexity  - O(n*d)
//Auxilary Space - O(1)

public class Main
{
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5};
		int d=2;
		Solve(arr,d);
	}
	static void Solve(int[] arr,int d){
	    int n=arr.length;
	    d=d%n;
	    for(int j=0;j<d;j++){
	        LeftRotate(arr);
	    }
	    
	    for(int i:arr){
	        System.out.print(i+" ");
	    }
	}
	static void LeftRotate(int[] arr){
	    int n=arr.length;
	    int temp=arr[0];
	    for(int i=1;i<n;i++){
	        arr[i-1]=arr[i];
	    }
	    arr[n-1]=temp;
	}
}

____________________________________________________________________________________________________________________________________________________________________


//Time Compexity - O(n)
//Auxilary Space - O(d)


public class Main
{
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5};
		int d=1;
		Solve(arr,d);
	}
	static void Solve(int[] arr,int d){
	    int n=arr.length;
	    d=d%n;
	    int[] temp=new int[d];
	    for(int i=0;i<d;i++){
	        temp[i]=arr[i];
	    }
	    for(int j=d;j<n;j++){
	        arr[j-d]=arr[j];
	    }
	    for(int k=0;k<d;k++){
	        arr[n-d+k]=temp[k];
	    }
	    for(int l:arr){
	        System.out.print(l+" ");
	    }
	}
}




