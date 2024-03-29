

//Time Complexity - O(n)
//Auxilary Space - O(1)





class Solution
{
    //Function to find the first non-repeating character in a string.
    static final int c=256;
    static char nonrepeatingCharacter(String s)
    {
        //Your code here
        int n=s.length();
        int[] arr=new int[c];
        for(int i=0;i<n;i++){
            arr[s.charAt(i)]++;
        }
        for(int i=0;i<n;i++){
            if(arr[s.charAt(i)]==1){
                return s.charAt(i);
            }
        }
        return '$';
    }
}


_____________________________________________________________________________________________________________________________________________________________________________


//Time Complexity - O(n)
//Auxilary Space - O(n)



import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String s="aabb";
		System.out.println(Solve(s));
	}
	static char Solve(String s){
	    int n=s.length();
	    LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
	    for(int i=0;i<n;i++){
	        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
	    }
	    
	    for(Map.Entry<Character,Integer> entry:map.entrySet()){
	        if(entry.getValue()==1){
	            return entry.getKey();
	        }
	    }
	    return '$';
	}  
}


____________________________________________________________________________________________________________________________________________________________________________


//Time Complexity - O(n)
//Auxilary Space - O(1)






import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String s="geeksforgeeks";
		System.out.println(Solve(s));
	}
	static int Solve(String s){
	    int n=s.length();
	    int[] arr=new int[256];
	    Arrays.fill(arr,-1);
	    for(int i=0;i<n;i++){
	        if(arr[s.charAt(i)]==-1){
	            arr[s.charAt(i)]=i;
	        }
	        else{
	            arr[s.charAt(i)]=-2;
	        }
	    }
	    int res=Integer.MAX_VALUE;
	    for(int i=0;i<256;i++){
	        if(arr[i]>=0){
	            res=Math.min(res,arr[i]);
	        }
	    }
	    return res;
	}
}

