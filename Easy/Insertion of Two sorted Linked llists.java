

//Time Complexity - O(n)
//Auxilary Space - O(1)






class Sol
{
   public static Node findIntersection(Node head1, Node head2)
    {
        // code here.
        Node dummy=new Node(0);
        Node res=dummy;
        while(head1!=null && head2!=null){
            if(head1.data==head2.data){
                res.next=new Node(head1.data);
                res=res.next;
                head1=head1.next;
                head2=head2.next;
            }
            else if(head1.data<head2.data){
                head1=head1.next;
            }
            else{
                head2=head2.next;
            }
        }
        return dummy.next;
    }
}
