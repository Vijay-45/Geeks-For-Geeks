

//Time Complexity - o(n)
//Auxilary Space - O(1)




class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        // code here
        if(head==null) return head;
        Node prev=null;
        Node temp=null;
        Node curr=head;
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
      
    }
}
