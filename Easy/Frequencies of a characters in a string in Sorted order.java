

//Time Compleixty - O(n)
//Auxilary Space - O(26)




public class Main
{
	public static void main(String[] args) {
		String s="geeksforgeeks";
		Solve(s);
	}
	static void Solve(String s){
	    int n=s.length();
	    int[] arr=new int[26];
	    for(int i=0;i<n;i++){
	        arr[s.charAt(i)-'a']++;
	    }
	    for(int i=0;i<26;i++){
	        if(arr[i]>0){
	            System.out.println((char)(i+'a')+" "+arr[i]);
	        }
	    }
	}
}
