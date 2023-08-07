

//Time Complexity - o(n)
//Auxilary Space - O(1)




class Solution
{
    int getMiddle(Node head)
    {
         // Your code here.
         int n=Count(head);
         int pos=0;
         pos=(n/2)+1;
         int count=1;
         Node curr=head;
         while(curr!=null){
             if(count==pos){
                 return curr.data;
             }
             count++;
             curr=curr.next;
         }
         return 0;
    }
    int Count(Node head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
}


_____________________________________________________________________________________________________________________________________________________________________________



  //Time Complexity - O(n)
  //Auxilary Space - O(1)





  class Solution
{
    int getMiddle(Node head)
    {
         // Your code here.
         Node slow=head;
         Node fast=head;
         
         while(fast!=null && fast.next!=null){
             slow=slow.next;
             fast=fast.next.next;
         }
         
         
         return slow.data;
    }
}

