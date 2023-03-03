

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

______________________________________________________________________________________________________________________________

//Count of 1's in Binary Sorted array 

//Time Complexity - O(Logn)
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
	            return (n-mid);
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


//Or
______________________________________________________________________________________________________________________________

//Time Complexity - O(Logn)
//Auxilary Space - O(1)


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] arr={1,1,1,1,1};
		int n=arr.length;
		int First=First_Occurence(arr,n,0,n-1);
		int res;
		if(First==-1){
		    res=0;
		}
		else{
		    res=(Last_Occurence(arr,n,0,n-1)-First+1);
		}
		System.out.println(res);
		
	}
	static int First_Occurence(int[] arr,int n,int l,int h){
	  while(l<=h){
	      int mid=l+(h-l)/2;
	      if((mid==0 || arr[mid-1]==0) && arr[mid]==1){
	          return mid;
	      }
	      else if(arr[mid]==1){
	          h=mid-1;
	      }
	      else{
	          l=mid+1;
	      }
	  }
	  return -1;
	}
	static int Last_Occurence(int[] arr,int n,int l,int h){
	    while(l<=h){
	        int mid=l+(h-l)/2;
	        if((mid==n-1) && arr[mid]==1){
	            return mid;
	        }
	        else if(arr[mid]==1){
	            l=mid+1;
	        }
	        else{
	            h=mid-1;
	        }
	    }
	    return -1;
	}
}




