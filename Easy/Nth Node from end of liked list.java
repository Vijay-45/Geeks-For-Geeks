

//Time Complexity - O(n)
//Auxilary Space - O(1)





class Solution
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	// Your code here
    	int count=0;
    	Node curr=head;
    	while(curr!=null){
    	    count++;
    	    curr=curr.next;
    	}
    	curr=head;
    	for(int i=0;i<count;i++){
    	    if(i==(count-n)){
    	        return curr.data;
    	    }
    	    curr=curr.next;
    	}
    	return -1;
    }
}


____________________________________________________________________________________________________________________________


//Time Complexity - O(n)
//Auxilary Space - o(1)



class Solution
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
        Node first=head;
        Node second=head;
        for(int i=0;i<n;i++){
            if(first==null) return -1;
            first=first.next;
        }
        while(first!=null){
            first=first.next;
            second=second.next;
        }
        return second.data;
    }
}

