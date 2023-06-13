


//Time Complexity  -O(n^2)
//Auxilary Space - O(1)




import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String s="abcd";
		System.out.println(Solve(s));
	}
	static int Solve(String s){
	    int n=s.length();
	    int res=Integer.MAX_VALUE;
	    for(int i=0;i<n;i++){
	        char c1=s.charAt(i);
	        for(int j=i+1;j<n;j++){
	            if(c1==s.charAt(j)){
	                res=Math.min(res,i);
	            }
	        }
	    }
	    return (res==Integer.MAX_VALUE)?-1:res;
	}
}

_____________________________________________________________________________________________________________________________________________________________________________



//Time Complexity - O(n)
//Auxilary Space - O(n)




import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String s="geeks";
		System.out.println(Solve(s));
	}
	static int Solve(String s){
	    int n=s.length();
	    LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
	    for(int i=0;i<n;i++){
	        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
	    }
	    for(Map.Entry<Character,Integer> entry:map.entrySet()){
	        if(entry.getValue()>1){
	            return s.indexOf(entry.getKey());
	        }
	    }
	    return -1;
	}
}


____________________________________________________________________________________________________________________________________________________________________________



//Time Complexity - O(n)
//Auxilary Space - O(1)





import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String s="geeks";
		System.out.println(Solve(s));
	}
	static int Solve(String s){
	    int n=s.length();
	    int[] arr=new int[256];
	    int res=Integer.MAX_VALUE;
	    Arrays.fill(arr,-1);
	    for(int i=0;i<n;i++){
	        if(arr[s.charAt(i)]==-1){
	            arr[s.charAt(i)]=i;
	        }
	        else{
	            res=Math.min(res,arr[s.charAt(i)]);
	        }
	    }
	    return (res==Integer.MAX_VALUE)?-1:res;
	}
}


____________________________________________________________________________________________________________________________________________________________________________




//Time Complexity - O(n)
//Auxilary Space - O(1)



import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String s="geeks";
		System.out.println(Solve(s));
	}
	static int Solve(String s){
	    int n=s.length();
	    boolean[] arr=new boolean[256];
	    int res=-1;
	    for(int i=(n-1);i>=0;i--){
	        if(arr[s.charAt(i)]==true){
	            res=i;
	        }
	        else{
	            arr[s.charAt(i)]=true;
	        }
	    }
	    return res;
	}  
}
