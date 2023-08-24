
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

____________________________________________________________________________________________________________________________




//Time Complexity - O(n)
//Auxilary Space - O(1)

//One Traversal

static Node EvenAndOdd(Node head){
	    Node curr=head;
	    Node OddS=null,OddE=null,EvenS=null,EvenE=null;
	    while(curr!=null){
	        if(curr.data%2!=0){
	//If OddS is null make two pointers point to the same Node 
	            if(OddS==null){
	                OddS=curr;
	                OddE=curr;
	            }
	//If Not then move OddE to the next Node and make them Connected
	            else{
	                OddE.next=curr;
	                OddE=OddE.next;
	                
	            }
	        }
	//Same Process as we did for the Odd Nodes
	        else{
	            if(EvenS==null){
	                EvenS=curr;
	                EvenE=curr;
	            }
	            else{
	                EvenE.next=curr;
	                EvenE=EvenE.next;
	            }
	        }
	        curr=curr.next;
	    }
	//If List Only Even Or Odd nodes this condition will handle that case
	    if(EvenS==null || OddS==null){
	        return head;
	    }
	    EvenE.next=OddS;
	    OddE.next=null;
	    return EvenS;
	    
	}
