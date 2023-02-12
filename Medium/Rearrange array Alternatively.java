
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
___________________________________________________________________________________________________________________________________________________________________


//Time Complexity - O(n)
//Auxilary Spaace - O(1)


public class Main
{
	public static void main(String[] args) {
	    int[] arr={1,2,3,4,5,6};
	    Solve(arr);
	}
	static void Solve(int[] arr){
	    int n=arr.length;
	    int max=arr[n-1]+1;
	    int min_ind=0,max_ind=n-1;
	    for(int i=0;i<n;i++){
	        if(i%2==0){
	            arr[i]=(arr[max_ind--]%max)*max+arr[i];
	        }
	        else if(i%2!=0){
	            arr[i] = (arr[min_ind++]%max)*max+arr[i];
	        }
	    }
	    
	    for(int j=0;j<n;j++){
	        arr[j]=arr[j]/max;
	    }
	    
	    for(int k:arr){
	        System.out.print(k+" ");
	    }
	}
}





