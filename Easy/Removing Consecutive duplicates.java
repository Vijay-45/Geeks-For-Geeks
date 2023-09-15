

//Time Complexity - O(n)
//Auxilary Space - O(n)



public static String removePair(String str)
    {
        // your code here
        int n=str.length();
        Deque<Character> stack = new ArrayDeque<>();
        String res="";
        for(int i=0;i<n;i++){
            if(stack.isEmpty()){
                stack.push(str.charAt(i));
            }
            else if(stack.peek()==str.charAt(i)){
                stack.pop();
            }
            else{
                stack.push(str.charAt(i));
            }
        }
        for(Character c:stack){
            res=c+res;
        }
        
        return res;
    }
