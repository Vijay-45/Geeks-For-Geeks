

//Time Complexity - O(n)
//Auxilary Space - O(1)



class Solution
{
    public static Node addOne(Node head) 
    { 
        //code here.

      //Reverse the list
        head=Reverse(head);

      //Then add the 1 to the number using the add method
        Node res=Add(head);

      //After adding reverse the resultant linked list
        res=Reverse(res);
        
        return res;
    }
    static Node Reverse(Node head){
        Node curr=head,temp=null;
        while(curr!=null && curr.next!=null){
            temp=curr.next;
            curr.next=temp.next;
            temp.next=head;
            head=temp;
        }
        return head;
    }
    
    static Node Add(Node head){
        int carry=0;
        Node dummy=new Node(0);
        Node res=dummy,curr=head;
        while(curr!=null || carry!=0){
            int req=0,val=0;
          //If curr completes iterating the linked list it is checked
            if(curr!=null) val=curr.data;
          //We need to only One so we add that to the head so we make this
            if(curr==head){
                req=1;
            }
            int sum=val+carry+req;
            int dig=sum%10;
            res.next=new Node(dig);
            res=res.next;
            
            carry=sum/10;
            //Until curr becomes null with this we can prevent nullPointerException
            if(curr!=null){
                curr=curr.next;
            }
        }
        return dummy.next;
    }
}
