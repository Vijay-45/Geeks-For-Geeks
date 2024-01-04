

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

_____________________________________________________________________________________________________________________________

//Time Complexity - O(n)
//Auxilary Space - O(n)



/*
we do this using previous smaller element and next smaller element we calculate both for the elements in the array.
and calculte the max width of the bar.
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
	    int[] ps=previousSmaller(arr);
	    int[] ns=nextSmaller(arr);
	    int res=0,curr=0;
	    for(int i=0;i<n;i++){
	        curr=arr[i];
	        curr+=(i-ps[i]-1)*arr[i]; //previous index is less then current index hence we used i-ps[i] and -1 after that to exculding current element
	        curr+=(ns[i]-i-1)*arr[i]; //next index is greater then curent index hence we used ns[i]-i and -1 to exculude current element.
	        
	        res=Math.max(res,curr);  //max value for every element
	    }
	    return res;
	}
	static int[] previousSmaller(int[] arr){
	    int n=arr.length;
	    Stack<Integer> stack=new Stack<>();
	    int[] res=new int[n];
	    res[0]=-1;
	    stack.push(0);
	    for(int i=1;i<n;i++){
	        while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
	            stack.pop();
	        }
	        if(stack.isEmpty()){
	            res[i]=-1;
	        }
	        else{
	            res[i]=stack.peek();
	        }
	        stack.push(i);
	    }
	    return res;
	}
	static int[] nextSmaller(int[] arr){
	    int n=arr.length;
	    Stack<Integer> stack=new Stack<>();
	    int[] res=new int[n];
	    res[n-1]=n;
	    stack.push(n-1);
	    for(int i=n-2;i>=0;i--){
	        while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
	            stack.pop();
	        }
	        if(stack.isEmpty()){
	            res[i]=n;
	        }
	        else{
	            res[i]=stack.peek();
	        }
	        stack.push(i);
	    }
	    return res;
	}
	
}
____________________________________________________________________________________________________________________________


//Time Complexity - O(n)
//Auxilary Sapce - O(n)


/*
This approach uses only one traversal and uses only one stack
This one is similar to the stock span problem in stock span we pop peek element when greater value comes whereas in case of 
current approach we pop peek element when smaller value comes.
In stock span problme we perform operations while pushing to the stack whereas in case of this approach we perform operations 
while popping out of the stack.
After popping we have left smaller element as the peek of the stack and current index is the right smaller element using this 
we can find the maximum rectangular are like i-stack.peek()-1;
*/



public static long getMaxArea(long arr[], long n) 
    {
        // your code here
        long res=0;
        int temp;
        long curr;
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){ // if current element is less then peek then perform pop
                temp=stack.pop();
		/* 
                   temp stores the poped elemet and we consider it as the element with maximum area width and calculate using
		   current index-peek element -1;
                   current index - left smaller element
		   peek element - right smaller element
     
		*/
                curr=arr[temp]*(stack.isEmpty()?1:i-stack.peek()-1); 
                res=Math.max(res,curr);
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            temp=stack.pop();
	    /*
              Here we traversed the entire array and now didnt have the right smaller element thats why we used n value
	      as right smaller element.
            */
            curr=arr[temp]*(stack.isEmpty()?n:n-stack.peek()-1);
            res=Math.max(res,curr);
        }
        return res;
    }
