

//Time Complexity - O(n^2)
//Auxilary Space - O(1)


public class Main
{
	public static void main(String[] args) {
		int[] a={2,3,4,5};
		int[] b={1,2,3};
		System.out.println(Solve(a,b));
		
	}
	static int Solve(int[] a,int[] b){
	    int n=a.length;
	    int m=b.length;
	    int count=0;
	    
	    for(int i=0;i<n;i++){
	        for(int j=0;j<m;j++){
	            if((Math.pow(a[i],b[j])>Math.pow(b[j],a[i]))){
	                count++;
	            }
	        }
	    }
	    return count;
	}
}
