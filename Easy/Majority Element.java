

//Time Complexity - O(n^2)
//Auxilary Space - O(1)

public class Main
{
	public static void main(String[] args) {
		int[] arr={20,30,40,50,50,50,50};
		Solve(arr);
	}
	static void Solve(int[] arr){
	    int n=arr.length;
	    int count;
	    boolean flag=false;
	    for(int i=0;i<n;i++){
	        count=0;
	        for(int j=i;j<n;j++){
	            if(arr[i]==arr[j]){
	                count++;
	            } 
	            if(count>(n/2)){
	                flag=true;
	                System.out.println(i);
	            }
	        }
	    }
	    if(!flag){
	        System.out.println(-1);
	    }
	    
	}
}


_____________________________________________________________________________________________________________________________________________________________________


//Time Complexity - O(n)
//Auxilary Space  - O(1)



public class Main
{
	public static void main(String[] args) {
		int[] arr={20,30,40,50,50,50,50};
		Solve(arr);
	}
	static void Solve(int[] arr){
	  int n=arr.length;
	  int res=0;
	  int count=1;
	  for(int i=1;i<n;i++){
	      if(arr[res]==arr[i]){
	          count++;
	      }
	      else{
	          count--;
	      }
	      if(count==0){
	          res=i;
	          count=1;
	      }
	  }
	  count=0;
	  for(int i=0;i<n;i++){
	      if(arr[res]==arr[i]){
	          count++;
	      }
	  }
	  if(count<=n/2){
	      System.out.println(-1);
	      return;
	   }
	  System.out.println(res);
	  
	}
}
