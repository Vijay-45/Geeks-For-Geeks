

//Time Complexity - O(n+m)
//Auxilary Space - O(1)


/*Here we Intially Find the count of nodes from the both the linked lists to get the long linked list.
  - Then we move the long linked list just before the intersection.
  - Then we move both the pointers when they met that is the intersection point */



class Intersect
{
    //Function to find intersection point in Y shaped Linked Lists.
	int intersectPoint(Node head1, Node head2)
	{
         // code here
         int c1=getCount(head1);
         int c2=getCount(head2);
         if(c1>c2){
             int d=c1-c2;
             return Find(d,head1,head2);
         }
         int d=c2-c1;
         return Find(d,head2,head1);
	}
	int getCount(Node head){
	    int count=0;
	    Node curr=head;
	    while(curr!=null){
	        count++;
	        curr=curr.next;
	    }
	    return count;
	}
	int Find(int d,Node curr1,Node curr2){
	    for(int i=0;i<d;i++){
	        curr1=curr1.next;
	    }
	    while(curr1!=null && curr2!=null){
	        if(curr1==curr2){
	            return curr1.data;
	        }
	        curr1=curr1.next;
	        curr2=curr2.next;
	    }
	    return -1;
	    
	}
}



