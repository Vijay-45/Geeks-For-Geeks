

//Time Complexity - O(n*n)
//Auxilary Space - O(1)




public class Main
{
	public static void main(String[] args) {
		int[] arr={13,15,12,14,16,8,6,4,10,30};
		for(int i:Solve(arr)){
		    System.out.print(i+" ");
		}
	}
	static int[] Solve(int[] arr){
	    int[] res=new int[arr.length];
	    for(int i=0;i<arr.length;i++){
	        int j=i-1,count=1;;
	        if(i==0) res[i]=1;
	        else{
	            while(j>=0 && arr[j]<=arr[i]){
	                count++;
	                j--;
	            }
	            res[i]=count;
	        }
	    }
	    return res;
	}
}

__________________________________________________________________________________________________________________________________________________

//Time Complexity - O(n)
//Auxilary Space - O(n)

/*
We need to Return the stock spans ex: - {100,80,60,70,60,75,85}   o/p - 1 1 1 2 1 4 6
if the left value is grater then the current value then span is 1
if the left values are less then or equal to the current value then the span will be no. of less left values +1;
for first element span will always be 1 because there is no left value
If there are more less values on the left side we can get the span value as current index-previos greatest value index.
For this we use Stack if left value is less then the current value we pop the top of the stack until we get a greater value and push the current element
iF left value is graeat we wont perform pop we calculate current index-top value this is why we are storing indexes in stack instead of values.
we push every value and it will be poped if any great value comes in the ride side.
*/
class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int arr[], int n)
    {
        // Your code here
        int[] res=new int[n];
        Stack<Integer> stack=new Stack<>();
        int span=0;
        stack.push(0);  //Storing the index values so that we can perofrm 
        res[0]=1;
        for(int i=1;i<n;i++){
            while(stack.isEmpty()==false && arr[stack.peek()]<=arr[i]){
                stack.pop();
            }
            span=stack.isEmpty()?i+1:i-stack.peek();
            stack.push(i);
            res[i]=span;
        }
        return res;
    }
    
}
