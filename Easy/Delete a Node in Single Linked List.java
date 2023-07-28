

//Time Complexity - O(n)
//Auxilary Space - O(1)




class GfG
{
    Node deleteNode(Node head, int x)
    {
        if(x==1){
            return head.next;
        }
        int count=1;
        Node curr=head;
        while(curr!=null){
            if(count==(x-1)){
                curr.next=curr.next.next;
                return head;
            }
            curr=curr.next;
            count++;
        }
        return null;
    }
}
