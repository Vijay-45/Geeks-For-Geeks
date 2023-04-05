
//Time Complexity - O(n)
//Auxilary Space - O(1)


public class Main
{
	public static void main(String[] args) {
		int[] arr={2,10,12,-4,5,-3,11,-6};
		Solve(arr);
	}
	static void Solve(int[] arr){
	    int n=arr.length;
	    int x=0,y=0;
	    int temp=0;
	    while(y<n){
	        if(arr[y]<0){
	            temp=arr[y];
	            arr[y]=arr[x];
	            arr[x]=temp;
	            y++;
	            x++;
	        }
	        else{
	            y++;
	        }
	    }
	    
	    for(int c:arr){
	        System.out.print(c+" ");
	    }
	}
}
____________________________________________________________________________________________________________________________



//Time Complexity - O(n)
//Auxilary Space - O(1)

//Lomuto Partition.......

public class Main
{
	public static void main(String[] args) {
		int[] arr={3,-10,5,-20};
		Solve(arr);
	}
	static void Solve(int[] arr){
	    int n=arr.length;
	    int l=0;
	    int temp=0;
	    int i=l-1;
	    for(int j=0;j<n;j++){
	        if(arr[j]<0){
	            i++;
	            temp=arr[i];
	            arr[i]=arr[j];
	            arr[j]=temp;
	        }
	    }
	    for(int c:arr){
	        System.out.print(c+" ");
	    }
	}
}
____________________________________________________________________________________________________________________________


//Time Complexity - O(n)
//Auxilary Space - O(1)


//Hoare's Partition.....


public class Main
{
	public static void main(String[] args) {
		int[] arr={2,-10,3,-20};
		Solve(arr);
	}
	static void Solve(int[] arr){
	    int n=arr.length;
	    int i=-1,j=n;
	    int temp=0;
	    while(true){
	        do{
	            i++;
	        }while(arr[i]<0);
	        do{
	            j--;
	        }while(arr[j]>=0);
	        if(i>=j) break;
	        temp=arr[i];
	        arr[i]=arr[j];
	        arr[j]=temp;
	    }
	    for(int c:arr){
	        System.out.print(c+" ");
	    }
	}
}
