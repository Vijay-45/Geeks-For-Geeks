

//Time Complexity - O(nlogn)
//Auxilary Space - O(1)



import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] arr={1,9,3,4,2,10};
		System.out.println(Solve(arr));
	}
	static int Solve(int[] arr){
	    int n=arr.length;
	    int res=1,curr=1;;
	    Arrays.sort(arr);
	    for(int i=1;i<n;i++){
	        if(arr[i]-arr[i-1]==1){
	            curr++;
	        }
	        else if(arr[i]!=arr[i-1]){
	            res=Math.max(res,curr);
	            curr=1;
	        }
	    }
	    return Math.max(res,curr);
	}
}


_____________________________________________________________________________________________________________________________________________________________________________


//Time Complexity - o(n)
//Auxilary Space - o(n)



class Solution
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    //Function to return length of longest subsequence of consecutive integers.
	static int findLongestConseqSubseq(int arr[], int n)
	{
	   // add your code here
	   HashSet<Integer> set = new HashSet<>();
	   int curr=1,res=1;
	   for(int i=0;i<n;i++){
	       set.add(arr[i]);
	   }
	   
	   for(int i=0;i<n;i++){
	       if(!set.contains(arr[i]-1)){
	           curr=1;
	           while(set.contains(arr[i]+curr)){
	               curr++;
	           }
	           res=Math.max(res,curr);
	       }
	   }
	   return res;
	}
}
