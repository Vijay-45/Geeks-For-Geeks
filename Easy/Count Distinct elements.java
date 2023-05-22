

//Time Complexity - O(n^2)
//Auxilary Space - O(1)





public class Main
{
	public static void main(String[] args) {
		int[] arr={15,12,13,12,13,13,18};
		System.out.println(Solve(arr));
	}
	static int Solve(int[] arr){
	    int n=arr.length;
	    int res=0;
	    for(int i=0;i<n;i++){
	        boolean flag=false;
	        for(int j=0;j<i;j++){
	            if(arr[i]==arr[j]){
	                flag=true;
	                break;
	            }
	        }
	        if(flag==false){
	            res++;
	        }
	    }
	    return res;
	}
}
____________________________________________________________________________________________________________________________________________________________________________




//Time Complexity - O(n)
//Auxilary Space - O(n)



import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] arr={15,12,13,12,13,13,18};
		System.out.println(Solve(arr));
	}
	static int Solve(int[] arr){
	    int n=arr.length;
	    HashSet<Integer> set = new HashSet<>();
	    for(int i=0;i<n;i++){
	        set.add(arr[i]);
	    }
	    return set.size();
	}
}

