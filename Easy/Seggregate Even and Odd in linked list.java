
//Time Complexity - O(n)
//Auxilary Space - O(1)



//Two Traversals

	static Node EvenAndOdd(Node head){
	    Node curr=head;
	    Node temp=head;
	    Node last=null;
//To get Hold of the last node of the linked list
	    while(curr.next!=null){
	        curr=curr.next;
	    }
//Stores the last node
	    temp=curr;
	    curr=head;
	    last=temp;
	    while(curr.next!=temp){
	        if(curr.data%2!=0){
            //For making new Head
	            head=curr.next;
            //last node chages as flow goes
	            last.next=curr;
	            last=last.next;
	        }
	        curr=curr.next;
	    }
//Removing the last node and makking the connection b/n the Even and Odd nodes
	    curr.next=curr.next.next;
//Making the last node as the last node of the resultant list.
	    last.next=temp;
	    temp.next=null;
	    return head;
	}
