

//Time Complexity - O(n)
//Auxilary Space - O(1)



class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        //Your code here
        Node curr=head;
      //Finding the mid of the list
        Node mid=findMid(curr);
      //Reversing the remaining half So that we can compare the both halves
        Node temp=Reverse(mid.next);
        
        while(temp!=null){
            if(curr.data!=temp.data){
                return false;
            }
            curr=curr.next;
            temp=temp.next;
        }
        return true;
    }
    Node findMid(Node head){
        Node slow=head,fast=head.next;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    Node Reverse(Node head){
        Node curr=head,temp=null;
        while( curr!=null && curr.next!=null){
            temp=curr.next;
            curr.next=temp.next;
            temp.next=head;
            head=temp;
        }
        
        return head;
    }
}
