

//Time Complexity - O(nlogn)
//Auxilary Space - O(logn)



class LinkedList
{
    //Function to sort the given doubly linked list using Merge Sort.
    static Node sortDoubly(Node head)
    {
        // add your code here
        if(head==null || head.next==null){
            return head;
        }
        
        Node right=FindMid(head);
        
        head=sortDoubly(head);
        right=sortDoubly(right);
        
        return merge(head,right);
    }
    static Node FindMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        Node temp=slow.next;
        slow.next=null;
        return temp;
    }
    static Node merge(Node first,Node second){
        if(first==null) return second;
        if(second==null) return first;
        if(first.data<second.data){
            first.next=merge(first.next,second);
            first.next.prev=first;
            first.prev=null;
            return first;
        }
        else{
            second.next=merge(first,second.next);
            second.next.prev=second;
            second.prev=null;
            return second;
        }
    }
}
