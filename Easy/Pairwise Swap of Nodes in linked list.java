


//Time Complexity - O(n)
//Auxilary Space - O(1)





class Swap
{
    //Function to swap elements pairwise.
    public static Node pairwise_swap(Node head)
    {
        // your code here
        if(head==null || head.next==null) return head;
        Node curr=head,temp=null,prev=null;
      //For Even nodes curr becomes null and for odd nodes curr.next becomes null 
        while(curr!=null && curr.next!=null){
            if(curr==head){
                head=curr.next;
            }
            if(prev!=null){
                prev.next=curr.next;
            }
          //Swapping the nodes
            temp=curr.next;
            curr.next=curr.next.next;
            temp.next=curr;
            prev=curr;
            
            
            curr=curr.next;
        }
        
        return head;
    }
       
}
