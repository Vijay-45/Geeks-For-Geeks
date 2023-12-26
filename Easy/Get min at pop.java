

//Time Comlexity - O(n)
//Auxilary Space - O(n)

/*
Here we will push only min elements into the stack not the array itself. we pass first value into stack assuming it as min value
and compare every value to the min value if a value is less then min value then we change the value on every traversal we 
push min value into the stack. In the second method we pop the elements from the stack.
*/

class GetMin
{
    //Function to push all the elements into the stack.
    public static Stack<Integer> _push(int arr[],int n)
    {
        // your code here
        Stack<Integer> stack=new Stack<>();
        int min=arr[0];
        stack.push(min);
        for(int i=1;i<n;i++){
            min=min>arr[i]?arr[i]:min; //Finding min element in the array from the left side and adding it into the stack
            stack.push(min);
        }
        return stack;
    }
    
    //Function to print minimum value in stack each time while popping.
    static void _getMinAtPop(Stack<Integer>s)
    {
        // your code here
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }
}
