

//Time Complexity - O(n)
//Auxilary Space - O(1)



class Solution{
    Node divide(int N, Node head){
        // code here

      //we make use of 4 pointers First Two acts as heads of the even and odd 
        Node even=null,odd=null;
        Node e=null,o=null;
        Node curr=head;
        while(curr!=null){
          //For even nodes 
            if(curr.data%2==0){
                if(even==null){
                    even=curr;
                    e=curr;
                }
                else{
                    e.next=curr;
                    e=e.next;
                }
            }
            else{
              //For Odd nodes
                if(odd==null){
                    odd=curr;
                    o=curr;
                }
                else{
                    o.next=curr;
                    o=o.next;
                }
            }
            curr=curr.next;
        }
      //If e is not null then combine Both even and Odd nodes
        if(e!=null) e.next=odd;
      //If odd is not null make last node null
        if(o!=null) o.next=null;
      //If even nodes are present then return even pointer
        if(even!=null) return even;
        return odd;
    }
}
