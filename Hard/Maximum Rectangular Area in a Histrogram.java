

//Time Complexity - O(n*2)
//Space Complexity - O(1)


/*
we return the maximum width of the bars ex:- there are two elements 6 and 5 consecutive then the maximum width is 10. means
5 is common in both the values so 10 is the output.
In this programme we consider every element as the min element and compare it with the adjacent elements if adjacent element
is greater then or equal to the current element then add to the curr variable and update the max value.
for both sides comparsion we used two for loops.

*/


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] arr={6,2,5,4,1,5,6};
		System.out.print(Solve(arr));
	}
	static int Solve(int[] arr){
	    int n=arr.length;
	    int req=0;
	    for(int i=0;i<n;i++){
	        int curr=arr[i];
	        for(int j=i-1;j>=0;j--){
	            if(arr[j]>=arr[i]){
	                curr+=arr[i];
	            }
	            else{
	                break;
	            }
	        }
	        for(int j=i+1;j<n;j++){
	            if(arr[j]>=arr[i]){
	                curr+=arr[i];
	            }
	            else{
	                break;
	            }
	        }
	        req=Math.max(req,curr);
	    }
	    return req;
	}
	
}
