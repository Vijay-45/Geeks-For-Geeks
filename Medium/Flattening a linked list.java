

//Time Complexity - O(n)
//Auxilary Space - O(n)



class GfG
{
    Node flatten(Node head)
    {
        if(head==null) return head;
        //We recursseviely call the right side of the list and stops when it becomes null
        Node temp=flatten(head.next);
      //Merge both the right list and bottom list 
        Node res=MergeTwoLists(temp,head);
        
        return res;
    }
    Node MergeTwoLists(Node one,Node two){
        Node dummy=new Node(0);
        Node res=dummy;
      /*Instead of making this as next pointer we make this using bottom as the complete resultant list can be traversed 
      Using bottom pointer in the bottom manner*/
        while(one!=null && two!=null){
            if(one.data<=two.data){
                res.bottom=new Node(one.data);
                res=res.bottom;
                one=one.bottom;
            }
            else{
                res.bottom=new Node(two.data);
                res=res.bottom;
                two=two.bottom;
            }
        }
        while(one!=null){
            res.bottom=new Node(one.data);
            res=res.bottom;
            one=one.bottom;
        }
        while(two!=null){
            res.bottom=new Node(two.data);
            res=res.bottom;
            two=two.bottom;
        }
        
        return dummy.bottom;
        
    }
}
