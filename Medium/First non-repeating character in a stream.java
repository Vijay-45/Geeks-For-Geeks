

//Time Complexity - O(n)
//Auxilary Space - O(1)




class Solution
{
    public String FirstNonRepeating(String s)
    {
        // code here
        int n=s.length();
        int[] arr=new int[26];
        StringBuilder res=new StringBuilder();
        Queue<Character> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            arr[s.charAt(i)-'a']++;
            q.add(s.charAt(i));
            while(!q.isEmpty()){
                if(arr[q.peek()-'a']==1){
                    res.append(q.peek());
                    break;
                }
                else{
                    q.poll();
                }
            }
            if(q.isEmpty()){
                res.append("#");
            }
        }
        return res.toString();
    }
}
