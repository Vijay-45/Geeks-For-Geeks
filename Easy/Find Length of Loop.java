//Time Complexity - O(n)
//Auxilary Space - O(1)




class Solution
{
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
        //Add your code here.
        Node slow=head;
        Node fast=head;
        int count=0;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                count=1;
                slow=slow.next;
                while(fast!=slow){
                    count++;
                    slow=slow.next;
                }
                return count;
            }
        }
        return 0;
    }
}
