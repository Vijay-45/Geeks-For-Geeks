

//Time Complexity - O(m+n)
//Auxilary Space - O(max(m,n))



/* In this problem we need to add two lists it includes three steps as: 
    -> First reverse the two input lists as the sizes of the lists can be different.
    -> After reversing both the lists add the data of the lists 
    -> After adding reverse the retruned list as it is the result list.  */



class Solution{
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list
        
        //Reverse two lists
        first=Reverse(first);
        second=Reverse(second);
        
        
        //add two lists
        Node res=add(first,second);
        
        
        //Reverse the result
        
        res=Reverse(res);
        
        return res;
    }
    static Node Reverse(Node head){
        Node curr=head;
        Node temp=null;
        Node prev=null;
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    static Node add(Node first,Node second){
        int carry=0;
        Node head=null;
        Node tail=null;
        while(first!=null || second!=null || carry!=0){
            int val1=0;
            // Condition for checking if first becomes null it can be handled here if it dont it will cause NullPointerException
            if(first!=null) val1=first.data;
            
            int val2=0;
            //Same as First One
            if(second!=null) val2=second.data;
            
            int sum=val1+val2+carry;
            int dig=sum%10;
            Node temp=new Node(dig);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
            carry=sum/10;
            if(first!=null) first=first.next;
            if(second!=null) second=second.next;
        }
        
        return head;
        
    }
}
