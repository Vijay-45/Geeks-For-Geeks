

//Time Complexity - O(n)
//Space Complexity - O(1)



class Solution {
    //Function to find first node if the linked list has a loop.
    public static int findFirstNode(Node head){
        //code here
        Node fast=head,slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                break;
            }
        }
        if(fast!=slow){
            return -1;
        }
        if(fast==head) return head.data;
        slow=head;
        while(fast.next!=slow.next){
            fast=fast.next;
            slow=slow.next;
        }
        return fast.next.data;
    }
}
