

//Time Complexity - O(n)
//Auxilary space - O(n)






import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String s="abc";
		Solve(s);
	}
	static void Solve(String s){
	    int n=s.length();
	    ArrayList<String> list = new ArrayList<>();
	    int start=0;
	    String res="";
	    for(int i=0;i<n;i++){
	        char ch=s.charAt(i);
	        if(ch==' '){
	            list.add(s.substring(start,i));
	            start=i+1;
	        }
	        else if(i==n-1){
	            list.add(s.substring(start,i+1));
	        }
	    }
	    
	    for(int i=list.size()-1;i>=0;i--){
	        if(i==0){
	            res=res+list.get(i);
	        }
	        else{
	             res=res+list.get(i)+" ";   
	        }
	    }
	    System.out.println(res);
	}
}
