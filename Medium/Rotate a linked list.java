


//Time Complexity - O(n)
//Auxilary Space - O(1)


//Left Rotating the linked list

class Solution{
    //Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        // add code here
        Node curr=head;
        int n=1;
        while(curr.next!=null){
            curr=curr.next;
            n++;
        }
      //Connecting the last node to the first node
        curr.next=head;
      //if k values exceeds the length of the linked list
        k=k%n;
        for(int i=0;i<k;i++){
            curr=curr.next;
        }
      //Making the head for the resultant linked list
        head=curr.next;
        curr.next=null;
        return head;
    }
}



____________________________________________________________________________________________________________________________






  //Time Complexity - O(n)
  //Auxilary Space - O(1)

//Right rotating the list 

  class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0){
            return head;
        }
        ListNode curr=head,temp=head;
        int n=0;
        while(curr.next!=null){
            curr=curr.next;
            n++;
        }
      //Connecting the last node to the first node
        curr.next=head;
      //If the k exceeds the length of the list
        k=k%(n+1);
      //No of jumps required to get the Node which becomes last node for the resultant list and gives the head of the resultant list
        int jump=(n-k);
        for(int i=0;i<jump;i++){
            temp=temp.next;
        }
        head=temp.next;
        temp.next=null;
        return head;
    }
}
