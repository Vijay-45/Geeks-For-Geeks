
//Time Compleixty - O(1)
//Auxilary Space - O(1)

/* We Just copies the data of the next pointer and then delete the next pointer */

class Solution
{
    void deleteNode(Node del)
    {
         // Your code here
         Node curr=del;
         curr.data=curr.next.data;
         curr.next=curr.next.next;
    }
}

