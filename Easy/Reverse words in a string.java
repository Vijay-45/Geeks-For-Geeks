

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




____________________________________________________________________________________________________________________________________________________________________________



//Time Complexity - O(n)
//Auxilary Space - o(n)




class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String s)
    {
        // code here 
        int n=s.length();
        char[] arr=s.toCharArray();
        int start=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='.'){
                Reverse(arr,start,i-1);
                start=i+1;
            }
        }
        Reverse(arr,start,n-1);
        Reverse(arr,0,n-1);
        
        String res=new String(arr);
        return res;
    }
    void Reverse(char[] arr,int start,int end){
        char temp=' ';
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
