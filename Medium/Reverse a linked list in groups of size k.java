


//Time Complexity - O(n)
//Auxilary Space - O(n)



static Node Solve(Node head,int k){
	    Node curr=head,temp=null,prev=null;
	    int count=0;
  //If nodes left at the end which are less then the window size to return them
	    while(curr!=null && count<k){
	        temp=curr.next;
	        curr.next=prev;
	        prev=curr;
	        curr=temp;
	        count++;
	    }
  //Starting next window making a recursive call 
	    if(temp!=null){
        //reverse list head
	        Node refHead=Solve(temp,k);
	        head.next=refHead; //connection the windows 
	    }
	    return prev;
	}



_____________________________________________________________________________________________________________________________





//Time Complexity - O(n)
//Auxilary Space - O(1)




static Node Solve(Node head,int k){
	   Node curr=head,temp=null,prevFirst=null;
	   boolean flag=true;
	   while(curr!=null){
	       Node first=curr,prev=null;
	       int count=0;
	       while(curr!=null && count<k){
	           temp=curr.next;
	           curr.next=prev;
	           prev=curr;
	           curr=temp;
	           count++;
	       }
		//To store the head node after first window reversal
	       if(flag){
	           head=prev;
	           flag=false;
	       }
	       else{
		//Connecting last node of the previous windoes with the first node of the current node
	           prevFirst.next=prev;
	       }
		//Storing the first node from every window
	       prevFirst=first;
	       
	   }
	   return head;
	}
