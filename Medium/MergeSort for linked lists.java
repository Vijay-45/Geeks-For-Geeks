

//Time Complexity - O(nlogn)
//Auxilary Space - O(n)




class Solution
{
    //Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head)
    {
        // add your code here
        if(head==null || head.next==null){
            return head;
        }
        //To find the mid Node which divides the List into two halves
        Node mid=findMid(head);
        
        Node left=head;
        Node right=mid.next;
        mid.next=null;
        //Recurssive calls for the sorting
        left=mergeSort(left);
        right=mergeSort(right);
        
        //Merging the both the left and right halves
        Node res=merge(left,right);
        
        return res;
    }
    static Node findMid(Node head){
        Node slow=head,fast=head.next;
        
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        
        return slow;
    }
    
    static Node merge(Node left,Node right){
        if(left==null) return right;
        if(right==null) return left;
        Node dummy=new Node(0);
        Node res=dummy;
        
        while(left!=null && right!=null){
            if(left.data<right.data){
                res.next=left;
                res=left;
                left=left.next;
            }
            else{
                res.next=right;
                res=right;
                right=right.next;
            }
        }
        
        while(left!=null){
            res.next=left;
            res=left;
            left=left.next;
        }
        while(right!=null){
            res.next=right;
            res=right;
            right=right.next;
        }
        
        return dummy.next;
    }
}


