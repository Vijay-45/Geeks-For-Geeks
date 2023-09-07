

//Time Complexity - O(n)
//Auxilary Space - O(1)



class Solution
{

   // Should rearrange given linked list such that all even
   // positioned Nodes are before odd positioned.
   // Returns nothing
    void rearrangeEvenOdd(Node head)
    {
          if(head==null || head.next==null) return;
          Node curr=head,even=null,odd=null,e=null;
          int count=1;
      //Based on the position we connect them as odd and even
          while(curr!=null){
              if(count%2==0){
                  if(even==null){
                      even=curr;
                      e=curr;
                  }
                  else{
                      e.next=curr;
                      e=e.next;
                  }
              }
              else{
                  if(odd==null){
                      odd=curr;
                  }
                  else{
                      odd.next=curr;
                      odd=odd.next;
                  }
              }
              count++;
              curr=curr.next;
          }
      //Connecting both odd postion and even postion
          odd.next=even;
          e.next=null;
          head=odd;
          
     }
}
