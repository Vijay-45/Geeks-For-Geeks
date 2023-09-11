

//Time Complexity - O(n)
//Auxilary Space - O(1)




class Solution {
    public static Node partition(Node head, int x) {
        // Your code here
        if(head==null || head.next==null) return head;
        Node curr=head;
      //Making nodes for storing less,greater and equal nodes
        Node left=null,l=null;
        Node right=null,r=null;
        Node same=null,s=null;
        while(curr!=null){
            if(curr.data<x){
                if(left==null){
                    left=curr;
                    l=curr;
                }
                else{
                    l.next=curr;
                    l=l.next;
                }
            }
            else if(curr.data>x){
                if(right==null){
                    right=curr;
                    r=curr;
                }
                else{
                    r.next=curr;
                    r=r.next;
                }
            }
            else{
                if(same==null){
                    same=curr;
                    s=curr;
                }
                else{
                    s.next=curr;
                    s=s.next;
                }
            }
            curr=curr.next;
        }
      //After making the nodes connect them
        if(left!=null && same!=null){
            l.next=same;
            s.next=right;
        }
        if(left==null && same!=null) s.next=right;
        if(left!=null && same==null) l.next=right;
        if(right!=null) r.next=null;
        if(left==null && same==null) return right;
         if(left==null) return same;
        return left;
        
    }
}
