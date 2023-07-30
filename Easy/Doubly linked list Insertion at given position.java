

//Time Complexity - O(n)
//Auxilary Space - O(1)



class GfG
{
    //Function to insert a new node at given position in doubly linked list.
    void addNode(Node head, int pos, int data)
	{
		// Your code here
		Node temp=new Node(data);
		Node curr=head;
		int count=0;
		while(curr!=null){
		    if(count==pos){
		        if(curr.next==null){
		            curr.next=temp;
		            temp.prev=curr;
		        }
		        else{
		            temp.next=curr.next;
		            curr.next.prev=temp;
		            temp.prev=curr;
		            curr.next=temp;
		        }
		    }
		    curr=curr.next;
		    count++;
		}
	}
}
