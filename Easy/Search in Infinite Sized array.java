

//Time Complexity - O(Position)
//Auxilary Space - O(1)



public class Main
{
	public static void main(String[] args) {
		int[] arr={10,20,30,40,50,60,70,80,90,100};
		int x=50;
		System.out.println(Solve(arr,x));
	}
	static int Solve(int[] arr,int x){
	    int i=0;
	   while(true){
	       if(arr[i]==x) return i;
	       if(arr[i]>x) return -1;
	       i++;
	   }
	}
}

_________________________________________________________________________________________________________________________________


//Time Complexity - O(log(position))
//Auxilary Space - O(1)


public class Main
{
	public static void main(String[] args) {
		int[] arr={10,20,30,40,50,60,70,80,90,100};
		int x=60;
		System.out.println(Solve(arr,x));
	}
	static int Solve(int[] arr,int x){
	    if(arr[0]==x) return 0;
	    int i=1;
	    int l=0,h=0;
	    while(arr[i]<x){
	        if(arr[i]==x) return i;
	        i=i*2;
	    }
	    l=(i/2)+1;
	    h=i-1;
	    while(l<=h){
	        int mid=l+(h-l)/2;
	        if(arr[mid]==x){
	            return mid;
	        }
	        else if(arr[mid]<x){
	            l=mid+1;
	        }
	        else{
	            h=mid-1;
	        }
	    }
	    return -1;
	}
}
