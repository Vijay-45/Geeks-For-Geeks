
//Time Complexity - O(n)
//Auxilary Space - O(n)



public class Main
{
	public static void main(String[] args) {
	    int[] arr={1,2,3,4,5,6};
	    Solve(arr);
	}
	static void Solve(int[] arr){
	   int n=arr.length;
	   int[] temp=new int[n];
	   int s=0,e=n-1;
	   int index=0;
	   while(s<=e){
	       if(s==e){
	           temp[index]=arr[s];
	           break;
	       }
	       temp[index++]=arr[e];
	       temp[index++]=arr[s];
	       s++;e--;
	   }
	   
	   for(int i=0;i<n;i++){
	       System.out.print(temp[i]+" ");
	   }
	}
}




