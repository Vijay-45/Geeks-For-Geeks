

//Time Complexity - O(n)
//Auxilary Space - O(1)



/* Intially for solving this we need the positions of the pointers which we need to swap
  - using Two for loops we keep track of the two pointers.
  - Main Thing is for swaping we need pointers which are before these two pointers for that in for loop we make use of two
    pointers and make loop to run before the required pointers so that we can have the data of the before pointers.
  */





class GFG
{
    //Function to swap Kth node from beginning and end in a linked list.
    Node swapkthnode(Node head, int num, int k)
    {
        // your code here
        if(k>num) return head;
        Node one=head,two=head,temp;
        Node left=null,right=null;
        for(int i=0;i<k-1;i++){
            left=one;
            one=one.next;
        }
        for(int i=0;i<(num-k);i++){
            right=two;
            two=two.next;
        }
        if(k==1){
            right.next=one;
            two.next=one.next;
            one.next=null;
            return two;
        }
        if(k==num){
            left.next=two;
            one.next=two.next;
            two.next=null;
            return one;
        }
        left.next=two;
        right.next=one;
        temp=one.next;
        one.next=two.next;
        two.next=temp;
        return head;
    }
}
