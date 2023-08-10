

//Time Complexity - o(n)
//Auxilary Space - O(1)



//using Three pointers..

class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        // code here
        if(head==null) return head;
        Node prev=null;
        Node temp=null;
        Node curr=head;
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
      
    }
}

_____________________________________________________________________________________________________________________________________________________________________________




//using Two Pointers..




public class Main
{
	public static void main(String[] args) {
	    Node head=new Node(10);
	    head.next=new Node(20);
	    head.next.next=new Node(30);
	    head.next.next.next=new Node(40);
	    
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
	    Node curr=head;
	    Node next=null;
	    while(curr.next!=null){
	        next=curr.next;
	        curr.next=next.next;
	        next.next=head;
	        head=next;
	    }
	    return head;
	}
}
class Node{
    int data;
    Node next;
    Node(int x){
        this.data=x;
    }
