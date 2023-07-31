

//Time Complexity - O(n)
//Auxilary Space - O(1)






public class Main
{
	public static void main(String[] args) {
		Node head=new Node(10);
		Node temp1=new Node(20);
		head.next=temp1;
		temp1.prev=head;
        Node temp2=new Node(30);
        temp1.next=temp2;
        temp2.prev=temp1;
		Node temp3=new Node(40);
		temp2.next=temp3;
		temp3.prev=temp2;
		Print(head);
		
		head=Reverse(head);
		Print(head);
	}
	static void Print(Node head){
	    while(head!=null){
	        System.out.print(head.data+" ");
	        head=head.next;
	    }
	    System.out.println();
	}
	static Node Reverse(Node head){
	    Node temp=head;
	    Node curr=null;
	    while(temp!=null){
	        curr=temp.prev;
	        temp.prev=temp.next;
	        temp.next=curr;
	        
	        temp=temp.prev;
	    }
	    if(curr!=null){
	        head=curr.prev;
	    }
	    return head;
	}
}
class Node{
    int data;
    Node next;
    Node prev;
    Node(int x){
        this.data=x;
    }
}
