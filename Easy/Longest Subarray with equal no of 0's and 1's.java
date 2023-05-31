

//Time Complexity - O(n)
//Auxilary Space - O(n)




import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] arr={1,0,1,1,1,0,0};
		System.out.println(Solve(arr));
	}
	static int Solve(int[] arr){
	    int n=arr.length;
	    int preSum=0,res=0;
	    HashMap<Integer,Integer> map = new HashMap<>();
	    for(int i=0;i<n;i++){
	        if(arr[i]==0){
	            arr[i]=-1;
	        }
	    }
	    for(int i=0;i<n;i++){
	        preSum+=arr[i];
	        if(preSum==0) res=i+1;
	        if(map.containsKey(preSum)){
	            res=Math.max(res,i-map.get(preSum));
	        }
	        else{
	            map.put(preSum,i);
	        }
	        
	    }
	    return res;
	    
	}
}
