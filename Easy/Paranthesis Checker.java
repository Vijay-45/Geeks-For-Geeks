

//Time Complexity - O(n)
//Auxilary Space - O(n)



class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String s)
    {
        // add your code here
        Deque<Character> stack=new ArrayDeque<>();
        
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
          //we push opening braces and if we encounter close brace corressponding  to it then we remove it
            if(x=='(' || x=='{' || x=='['){
                stack.push(x);
            }
            else{
                if(stack.isEmpty()==true){
                    return false;
                }
          //if top and the curr character are not same this conditioon returns false
                else if(isMapping(stack.peek(),x)==false){
                    return false;
                }
                else{
                    stack.pop();
                }
            }
        }
        return (stack.isEmpty()==true);
    }
    static boolean isMapping(char a,char b){
        return ((a=='(' && b==')') || (a=='{' && b=='}') || (a=='[' && b==']'));
    }
}
