


//Time Complexity - O(SqareRoot of n)
//Auxilary Space - O(1)

public class Main
{
	public static void main(String[] args) {
	    int n=25;
	    System.out.println(Solve(n));
	}
	static int Solve(int n){
	    int i=1;
	    while(i*i<=n){
	        i++;
	    }
	    return (i-1);
	}
}

_________________________________________________________________________________________________________________________________


//Time Complexity - O(Logn)
//Auxilary Space - O(1)


public class Main
{
	public static void main(String[] args) {
	    int n=144;
	    System.out.println(Solve(n));
	}
	static int Solve(int n){
	   int l=1,h=n,ans=-1;
	   while(l<=h){
	       int mid=l+(h-l)/2;
	       int mySq=mid*mid;
	       if(mySq==n){
	           return mid;
	       }
	       else if(mySq>n){
	           h=mid-1;
	       }
	       else{
	           l=mid+1;
	           ans=mid;
	       }
	   }
	   return ans;
	}
}
