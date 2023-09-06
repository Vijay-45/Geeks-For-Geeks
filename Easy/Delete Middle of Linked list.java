


//Time Complexity - o(n)
//Auxilary Space - O(1)




class Solution {
    Node deleteMid(Node head) {
       
        if(head==null || head.next==null) return null;
        Node fast=head,slow=head,prev=null;
      /*By using This Algorithm we get mid value so we used prev value which holds the previous value of the slow
      and removes the slow pointer which is the middle node after fast becomes null or fast.next becomes null 
        */
        while(fast!=null && fast.next!=null){
            prev=slow;
            fast=fast.next.next;
            slow=slow.next;
        }
        prev.next=slow.next;
        return head;
    }
}
