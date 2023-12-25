

//Time Complexity - O(n)
//Auxilary Space - O(n)


/*This is similar to the Stock Span problem.
we start traversing from the right side and if find any element greater then the peek element we pop the stack.
After poping if stack becomes empty then add -1 else add stack.peek() and push the current element into the stack
return the array.
  */



class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        Stack<Long> stack=new Stack<>();
        long[] res=new long[n];
        stack.push(arr[n-1]);
        res[n-1]=-1;
        for(int i=n-2;i>=0;i--){
            while(stack.isEmpty()==false && stack.peek()<=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                res[i]=-1;
            }
            else{
                res[i]=stack.peek();
            }
            stack.push(arr[i]);
        }
        return res;
    } 
}
