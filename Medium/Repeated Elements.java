

//Time Complexity - O(n)
//Auxialary Space - O(n)


import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[] arr={0,2,1,3,2,2};
	    Solve(arr);
	}
	static void Solve(int[] arr){
	    int n=arr.length;
	    HashMap<Integer,Integer> map=new HashMap<>();
	    for(int i=0;i<n;i++){
	        if(map.containsKey(arr[i])){
	            map.put(arr[i],map.get(arr[i])+1);
	        }
	        else{
	            map.put(arr[i],1);
	        }
	    }
	    
	    for(Map.Entry<Integer,Integer> e:map.entrySet()){
	        if(e.getValue() > 1){
	            System.out.println(e.getKey());
	        }
	    }
	    
	}
}
