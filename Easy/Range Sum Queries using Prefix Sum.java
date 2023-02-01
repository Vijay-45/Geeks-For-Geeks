import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[] arr={4,5,3,2,5};
	    int q=3;
	    Solve(arr,q);
	}
	static void Solve(int[] arr,int q){
	    Scanner sc=new Scanner(System.in);
	    int[] prefix=new int[arr.length];
	    prefix[0]=arr[0];
	    for(int i=1;i<prefix.length;i++){
	        prefix[i]=arr[i]+prefix[i-1];
	    }
	    int l,r;
	    for(int i=0;i<q;i++){
	        l=sc.nextInt();
	        r=sc.nextInt();
	        if(l==0){
	            System.out.println(prefix[r]);
	        }
	        else{
	            System.out.println(prefix[r]-prefix[l-1]);
	        }
	    }
	}
}
