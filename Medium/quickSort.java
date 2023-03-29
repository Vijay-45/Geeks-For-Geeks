

//Time Complexity - O(nlogn)
//Auxilary Space  - O(logn)


//Naive Partition....





































______________________________________________________________________________________________________________________________




//Time Complexity - O(nlogn)
//Auxilary Space - O(logn)



//Lomuto Partition..


public class Main
{
	public static void main(String[] args) {
		int[] arr={10,80,30,90,40,50,70};
		int n=arr.length;
		quickSort(arr,0,n-1);
		
		for(int i:arr){
		    System.out.print(i+" ");
		}
	}
	static void quickSort(int[] arr,int l,int h){
	    if(l<h){
	        int m=LamutoPartition(arr,l,h);
	        quickSort(arr,l,m-1);
	        quickSort(arr,m+1,h);
	    }
	}
	static int LamutoPartition(int[] arr,int l,int h){
	    int p=arr[h];
	    int i=l-1;
	    int temp=0;
	    for(int j=l;j<h;j++){
	        if(arr[j]<p){
	            i++;
	            temp=arr[i];
	            arr[i]=arr[j];
	            arr[j]=temp;
	        }
	    }
	    temp=arr[i+1];
	    arr[i+1]=p;
	    arr[h]=temp;
	    return i+1;
	}
}
