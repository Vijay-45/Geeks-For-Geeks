

//Time Complexity - O(n)
//Auxilary Space - O(1)


public static Node reverseDLL(Node  head)
{
    //Your code here
    Node curr=head,pre=null;
//swapping the next and prev pointers and moving the curr in the prev direction
    while(curr!=null){
        Node temp=curr.prev;
        curr.prev=curr.next;
        curr.next=temp;
        pre=curr;
        curr=curr.prev;
    }
    return pre;
    
}
