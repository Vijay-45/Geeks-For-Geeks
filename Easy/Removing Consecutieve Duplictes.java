

//Time Complexity - O(n)
//Auxilary Space - O(n)



class Solution
{
    //Function to remove consecutive duplicates from given string using Stack.
    public static String removeConsecutiveDuplicates(String str)
    {
        // Your code here
        Deque<Character> stack =new ArrayDeque<>();
        String res="";
        for(int i=0;i<str.length();i++){
            if(stack.isEmpty()){
                stack.push(str.charAt(i));
                res+=str.charAt(i);
            }
            if(stack.peek()!=str.charAt(i)){
                stack.push(str.charAt(i));
                res=res+str.charAt(i);
            }
        }
        return res;
    }
}
