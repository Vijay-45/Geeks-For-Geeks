

//Time Complexity - O(n)
//Auxilary Space - O(1)




class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        Node fast=head,slow=head;
        if(head==null || head.next==null){
            return;
        }
        
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                break;
            }
        }
        if(slow!=fast){
            return;
        }
        slow=head;
        if(slow==fast){
            while(fast.next!=slow){
                fast=fast.next;
            }
        }
        else{
            while(fast.next!=slow.next){
                fast=fast.next;
                slow=slow.next;
            }
        }
        fast.next=null;
        return;
    }
}
