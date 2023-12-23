

//Time Complexity - O(n*n)
//Auxilary Space - O(1)




public class Main
{
	public static void main(String[] args) {
		int[] arr={13,15,12,14,16,8,6,4,10,30};
		for(int i:Solve(arr)){
		    System.out.print(i+" ");
		}
	}
	static int[] Solve(int[] arr){
	    int[] res=new int[arr.length];
	    for(int i=0;i<arr.length;i++){
	        int j=i-1,count=1;;
	        if(i==0) res[i]=1;
	        else{
	            while(j>=0 && arr[j]<=arr[i]){
	                count++;
	                j--;
	            }
	            res[i]=count;
	        }
	    }
	    return res;
	}
}
