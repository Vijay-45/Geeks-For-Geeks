

//Time Complexity - O(n)
//Auxilary Space - O(1)



class Solution {
    Node sortedInsert(Node head, int key) {
        // Add your code here.
        if(head==null) return head;
        Node curr=head,pre=null;
      //If the key value is less than the head node
        if(head.data>=key){
            Node temp=new Node(key);
            temp.next=head;
            return temp;
        }
      /*Maintaning the pre node if we encounter the node value greater or equal than the key value then we insert node after
        The pre node before the current node
          */
        while(curr!=null){
            if(curr.data>=key){
                Node temp=new Node(key);
                temp.next=pre.next;
                pre.next=temp;
                return head;
            }
            pre=curr;
            curr=curr.next;
        }
      //If all nodes value are less than the key value then we insert node at last
        Node temp=new Node(key);
        pre.next=temp;
        return head;
    }
}
