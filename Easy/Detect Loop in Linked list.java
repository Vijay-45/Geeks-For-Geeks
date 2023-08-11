

//Time Complexity - O(n)
//Auxilary Space - o(1)

/*Here we uses Floyd’s Cycle-Finding Algorithm in which two pointers move in different speeds as one pointer takes one step
  where as another one takes two steps if they meet each other then there exists a loop in the linked list */
  


class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
        // Add code here
        Node slow=head;
        Node fast=head;
        while(slow!=null && (fast!=null && fast.next!=null)){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
}
