

//Time COmplexity - O((n-k)*k*k)
//Auxilary Space - o(1)



public class Main
{
	public static void main(String[] args) {
		int[] arr={10,20,20,10,30,40,10};
		int k=4;
		Solve(arr,k);
	}
	static void Solve(int[] arr,int k){
	    int n=arr.length;
	    for(int i=0;i<=(n-k);i++){
	        int count=0;
	        for(int j=0;j<k;j++){
	            boolean flag=false;
	            for(int p=0;p<j;p++){
	                if(arr[i+j]==arr[i+p]){
	                    flag=true;
	                    break;
	                }
	            }
	            if(flag==false){
	                count++;
	            }
	        }
	        System.out.print(count+" ");
	    }
	}
}
______________________________________________________________________________________________________________________________________________________________________________



//Time Complexity - o(n)
//Auxilary Space - o(k)




import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] arr={10,20,20};
		int k=2;
		Solve(arr,k);
	}
	static void Solve(int[] arr,int k){
	    int n=arr.length;
	    HashMap<Integer,Integer> map =new HashMap<>();
	    for(int i=0;i<k;i++){
	        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
	    }
	    System.out.print(map.size()+" ");
	    for(int i=k;i<n;i++){
	        map.put(arr[i-k],map.get(arr[i-k])-1);
	        if(map.get(arr[i-k])==0){
	            map.remove(arr[i-k]);
	        }
	        
	        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
	        System.out.print(map.size()+" ");
	    }
	}
}

