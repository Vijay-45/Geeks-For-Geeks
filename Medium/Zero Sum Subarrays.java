

//Time Complexity - O(n^2)
//Auxilary Space - O(1)



import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] arr={6,-1,-3,4,-2,2,4,6,-12,-7};
		System.out.println(Solve(arr));
	}
	static int Solve(int[] arr){
	    int n=arr.length;
	    int count=0,sum=0;
	    for(int i=0;i<n;i++){
	        sum=0;
	        for(int j=i;j<n;j++){
	            sum+=arr[j];
	            if(sum==0){
	                count++;
	            }
	        }
	    }
	    return count;
	}
}
_____________________________________________________________________________________________________________________________________________________________________________



//Time Complexity - O(n)
//Auxilary Space - o(n)







class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n) 
    {
        //Your code here
        long count=0,preSum=0;
        HashMap<Long,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            preSum+=arr[i];
            if(preSum==0) count++;
            if(map.containsKey(preSum)){
                map.put(preSum,map.get(preSum)+1);
            }
            else{
                map.put(preSum,1);
            }
        }
        
        for(Map.Entry<Long,Integer> entry:map.entrySet()){
            long temp = entry.getValue();
            count+=(temp*(temp-1))/2;
        }
        return count;
    }
}
