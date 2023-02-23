

//Time Complexity - O(n)
//Auxilary Space - O(1)

public class Main
{
	public static void main(String[] args) {
		int[] n={5,2,9,4,8};
		System.out.println(Solve(n,0,3));
	}
	static int Solve(int[] arr,int l,int r){
	    int n=arr.length;
	    int res=0;
	    for(int i=l;i<=r;i++){
	        res+=arr[i];
	    }
	    return res;
	}
}


________________________________________________________________________________________________________________________________________________________________________


//Time Complexity - O(n)
//Auxilary Space - O(n)

public class Main
{
	public static void main(String[] args) {
		int[] n={5,2,9,4,8};
		System.out.println(Solve(n,0,3));
	}
	static int Solve(int[] arr,int l,int r){
	  int n=arr.length;
	  int[] temp=new int[n];
	  int res=0;
	  temp[0]=arr[0];
	  for(int i=1;i<n;i++){
	      temp[i]=arr[i]+temp[i-1];
	  }
	  if(l==0){
	      res=temp[r];
	      return res;
	  }
	  else{
	      res=temp[r]-temp[l-1];
	      return res;
	  }
	}
}
