
//Time Complexity - O(n/2)
//Auxilary Space -  O(n/2)




class Solution
{
    //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer>s,int n){
        // code here
        Solve(s,n,0);
    } 
    void Solve(Stack<Integer> s,int n,int inx){
        if(inx==n/2){
            s.pop();
            return;
        }
        int x=s.pop();
        Solve(s,n,++inx);
        s.push(x);
    }
}



