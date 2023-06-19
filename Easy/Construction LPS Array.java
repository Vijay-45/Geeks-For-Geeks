

//Time Complexity - O(n^3)
//Auxilary Space - O(n)



public class Main
{
	public static void main(String[] args) {
		String s="ababacab";
		int[] arr=new int[s.length()];
		Solve(s,arr);
		for(int i:arr){
		    System.out.print(i+" ");
		}
	}
	static void Solve(String s,int[] arr){
	    for(int i=0;i<s.length();i++){
	        arr[i]=Another(s,i+1);
	    }
	}
	static int Another(String s,int n){
	    for(int i=n-1;i>0;i--){
	        boolean flag=true;
	        for(int j=0;j<i;j++){
	            if(s.charAt(j)!=s.charAt(n-i+j)){
	                flag=false;
	            }
	        }
	        if(flag){
	            return i;
	        }
	    }
	    return 0;
	}
}

_____________________________________________________________________________________________________________________________________________________________________________



//Time Complexity - O(n)
//Auxilary Space - O(1)





public class Main
{
	public static void main(String[] args) {
		String s="ababacab";
		int[] arr=new int[s.length()];
		Solve(s,arr);
		for(int i:arr){
		    System.out.print(i+" ");
		}
	}
	static void Solve(String s,int[] arr){
	    int n=s.length();
	    int len=0,i=1;
	    arr[0]=0;
	    while(i<n){
	        if(s.charAt(i)==s.charAt(len)){
	            len++;
	            arr[i]=len;
	            i++;
	        }
	        else{
	            if(len==0){
	                arr[i]=0;
	                i++;
	            }
	            else{
	                len=arr[len-1];
	            }
	        }
	    }
	}
}

