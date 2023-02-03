
//Time Complexity - O(n)
//Auxilary Space - O(1)

//Two Traversals

public class Main
{
	public static void main(String[] args) {
		int[] arr={20,20,20};
		System.out.println(Solve(arr));
	}
	static int Solve(int[] arr){
	    int max=Large(arr);
	    int res=-1;
	    for(int i=0;i<arr.length;i++){
	        if(arr[i]!=arr[max]){
	            if(res==-1) res=i;
	            if(arr[res]<arr[i]) res=i;
	        }
	    }
	    return res;
	}
	static int Large(int[] arr){
	    int max=0;
	    for(int i=0;i<arr.length;i++){
	        if(arr[max]<arr[i]) max=i;
	    }
	    return max;
	}
}


//One Traversal

public class Main
{
	public static void main(String[] args) {
		int[] arr={7,12,12,12};
		System.out.println(Solve(arr));
	}
	static int Solve(int[] arr){
	   int m=0,s=-1;
	   for(int i=1;i<arr.length;i++){
	       if(arr[m]<arr[i]){
	           s=m;
	           m=i;
	       }
	       if(arr[m]>arr[i]){
	           if(s==-1) s=i;
	           if(arr[s]<arr[i]) s=i;
	           
	       }
	   }
	   return s;
	}
}

