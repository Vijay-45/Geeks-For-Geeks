

//Time Complexity - O(n)
//Auxilary Space- O(n)




import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Node head=new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		head.next.next.next=new Node(40);
		head.next.next.next.next=new Node(50);
		
		
		head.random=head.next.next;
		head.next.next.random=head;
		head.next.random=head.next.next.next;
		head.next.next.next.random=head.next.next;
		head.next.next.next.next.random=head.next.next.next;
		
		
		Node res=Clone(head);
		Print(head);
		
	}
	static void Print( Node head){
	    while(head!=null){
	        System.out.print(head.data+" ");
	        head=head.next;
	    }
	    System.out.println();
	}
	static Node Clone(Node head){
    //we Store make use of map and create nodes 
	     Map<Node,Node> map=new HashMap<>();
    //Creating the nodes by traversing the linked list
	     for(Node curr=head;curr!=null;curr=curr.next){
	         map.put(curr,new Node(curr.data));
	     }
    //Connect nodes of the resultant list using input list
	     for(Node curr=head;curr!=null;curr=curr.next){
	         Node temp=map.get(curr);
	         temp.next=map.get(curr.next);
	         temp.random=map.get(curr.random);
	     }
	     
	     return map.get(head);
	}
}
class Node{
    int data;
    Node next,random;
    Node(int x){
        this.data=x;
    }
}
