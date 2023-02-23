

//Time Complexity - O(n^2)
//Auxilary Space - O(1)

public class Main
{
	public static void main(String[] args) {
		int[] arr={7,10,13,14};
		Solve(arr);
	}
	static void Solve(int[] arr){
	    int n=arr.length;
	    int res=1;
	    int c;
	    for(int i=0;i<n;i++){
	        c=1;
	        for(int j=i;j<n-1;j++){
	            if((arr[j]%2==0 && arr[j+1]%2!=0)||(arr[j]%2!=0 && arr[j+1]%2==0)){
	                c++;
	            }
	            else{
	                break;
                }
	            res=Math.max(res,c);
	        }
	    }
	    
	    System.out.println(res);
	}
}
________________________________________________________________________________________________________________________________________________________________________


//Time Complexity - O(n)
//Auxilary Space - O(1)

public class Main
{
	public static void main(String[] args) {
		int[] arr={7,7,7,7};
		Solve(arr);
	}
	static void Solve(int[] arr){
	    int n=arr.length;
	    int res=1;
	    int c=1;
	    for(int i=1;i<n;i++){
	        if((arr[i]%2==0 && arr[i-1]%2!=0) || (arr[i]%2!=0 && arr[i-1]%2==0)){
	            c++;
	        }
	        else{
	            c=1;
	        }
	        res=Math.max(res,c);
	    }
	    System.out.println(res);
	}
}
