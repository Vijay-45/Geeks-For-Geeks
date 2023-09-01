


//Time Complexity - O(m+n)
//Auxilary Space- O(1)





class LinkedList
{
    //Function to merge two sorted linked list.
    Node sortedMerge(Node one, Node two ) {
      //If any one of the list is empty just return the another list
        if(one==null) return two;
        if(two==null) return one;
        Node head=null,tail=null;
      //Using this we get Head pointer
        if(one.data<=two.data){
            head=tail=one;
            one=one.next;
        }
        else{
            head=tail=two;
            two=two.next;
        }
      //Using this we are changing the links between the nodes
        while(one!=null && two!=null){
            if(one.data<=two.data){
                tail.next=one;
                tail=one;
                one=one.next;
            }
            else{
                tail.next=two;
                tail=two;
                two=two.next;
            }
        }
      //If one of the list is completed and another one is remaining just make the connection to it
        if(one==null){
            tail.next=two;
        }
        else{
            tail.next=one;
        }
        return head;
        
        
        
        
        
        
     // This is a "method-only" submission. 
     // You only need to complete this method
     
   } 
}
