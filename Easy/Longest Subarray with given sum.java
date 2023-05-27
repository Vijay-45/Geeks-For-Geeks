

//Time Complexity - O(n)
//Auxilary Space - O(n)



import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[] arr={3,1,0,1,8,2};
	    int sum=5;
	    Solve(arr,sum);
	}
	static void Solve(int[] arr,int k){
	   int n=arr.length;
	   HashMap<Integer,Integer> map =new HashMap<>();
	   int preSum=0,res=0;
	   for(int i=0;i<n;i++){
	       preSum+=arr[i];
	       if(preSum==k) res=i+1;
	       if(map.containsKey(preSum-k)){
	           res=Math.max(res,i-map.get(preSum-k));
	       }
	       map.put(preSum,i);
	   }
	   System.out.println(res);
	}
}
