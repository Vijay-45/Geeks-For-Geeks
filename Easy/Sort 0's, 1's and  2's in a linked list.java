

//Time Complexity - O(n)
//Auxilary Space - O(1)





class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        // add your code here
        Node zero=new Node(0);
        Node zeroTail=zero;
        Node one=new Node(0);
        Node oneTail=one;
        Node two=new Node(0);
        Node twoTail=two;
        
        
        Node curr=head;
        while(curr!=null){
            int val=curr.data;
            if(val==0){
                zeroTail.next=new Node(0);
                zeroTail=zeroTail.next;
            }
            else if(val==1){
                oneTail.next=new Node(1);
                oneTail=oneTail.next;
            }
            else{
                twoTail.next=new Node(2);
                twoTail=twoTail.next;
            }
            curr=curr.next;
        }
        oneTail.next=two.next;
        zeroTail.next=one.next;
        
        return zero.next;
    }
}

