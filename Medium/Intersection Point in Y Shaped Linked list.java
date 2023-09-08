

//Time Complexity  - O(m+n)
//Auxilary Space - O(1)




class Intersect
{
    //Function to find intersection point in Y shaped Linked Lists.
	int intersectPoint(Node one, Node two)
	{
         // code here
    //Gets the count of the two lists 
         int c1=getCount(one);
         int c2=getCount(two);
         if(c1>c2){
             int d=c1-c2;
             return Solve(one,two,d);
         }
         int d=c2-c1;
         return Solve(two,one,d);
	}
	static int getCount(Node head){
	    int count=0;
	    while(head!=null){
	        count++;
	        head=head.next;
	    }
	    return count;
	}
	static int Solve(Node one,Node two,int d){
    //We move the pointer which is long and make sure both lists traverse at same time
	    for(int i=0;i<d;i++){
	        one=one.next;
	    }
	    while(one!=null && two!=null){
        //If both meet then it is the intersection point
	        if(one==two){
	            return one.data;
	        }
	        one=one.next;
	        two=two.next;
	    }
	    return -1;
	}
}


