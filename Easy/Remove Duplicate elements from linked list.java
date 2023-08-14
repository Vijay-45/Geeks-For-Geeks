

//Time Complexity - O(n)
//Auxilary Space - O(1)




class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
        Node dummy=new Node(0);
        Node res=dummy;
        Node curr=head;
        while(curr!=null){
            if(curr.next==null){
                Node newNode=new Node(curr.data);
                res.next=newNode;
                res=newNode;
            }
            else if(curr.data!=curr.next.data){
                Node newNode=new Node(curr.data);
                res.next=newNode;
                res=newNode;
            }
            curr=curr.next;
        }
        return dummy.next;
    }
}
