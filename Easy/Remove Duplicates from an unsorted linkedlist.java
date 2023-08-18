

//Time Complexity - O(n)
//Auxilary Space - O(n)





class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
         // Your code here
         if(head==null || head.next==null) return head;
         Node curr=head;
         Set<Integer> set=new HashSet<>();
         set.add(curr.data);
         while(curr.next!=null){
             if(!set.contains(curr.next.data)){
                 set.add(curr.next.data);
                 curr=curr.next;
             }
             else{
                 curr.next=curr.next.next;
             }
         }
         return head;
         
         
    }
}
