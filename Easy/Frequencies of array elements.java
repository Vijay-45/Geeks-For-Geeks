public class Main
{
	public static void main(String[] args) {
	    int[] arr={10,20,20,10,30};
	    Solve(arr);
	}
	static void Solve(int[] arr){
	    int n=arr.length;
	    for(int i=0;i<n;i++){
	        boolean flag=false;
	        for(int j=0;j<i;j++){
	            if(arr[i]==arr[j]){
	                flag=true;
	                break;
	            }
	        }
	        if(flag==true){
	            continue;
	        }
	        int freq=1;
	        for(int j=i+1;j<n;j++){
	            if(arr[i]==arr[j]){
	                freq++;
	            }
	        }
	        System.out.println(arr[i]+" "+freq);
	    }
	}
}
_____________________________________________________________________________________________________________________________________________________________________________


//Time Complexity - O(n)
//Auxilary Space - O(n)





import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[] arr={10,20,20,10,30};
	    Solve(arr);
	}
	static void Solve(int[] arr){
	    int n=arr.length;
	    HashMap<Integer,Integer> map = new HashMap<>();
	    for(int i=0;i<n;i++){
	        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
	    }
	    for(Map.Entry<Integer,Integer> entry:map.entrySet()){
	        System.out.println(entry.getKey()+" "+entry.getValue());
	    }
	       
	}
}


//Time Complexity - O(n^2)
//Auxilary Space - o(1)



