
//Time Complexity - O(N*LogN)
//Auxilary Space - O(1)


class Solution
{
  //Function to find median of the array elements.  
  public int median(int A[],int N)
    {
      
       Arrays.sort(A);
       int l=0,h=N-1;
       int mid=0,res=0;
       mid=(l+h)/2;
       if((N%2)==0){
           res=(int)(Math.floor((A[mid]+A[mid+1])/2));
       }
       else{
           res=A[mid];
       }
       return res;
       
       //Your code here
       //If median is fraction then conver it to integer and return
    }
    //Function to find median of the array elements.
    public int mean(int A[],int N)
    {
       //Your code here
       int sum=0;
       for(int i=0;i<N;i++){
           sum+=A[i];
       }
       return ((int)Math.floor(sum/N));
    }

}


