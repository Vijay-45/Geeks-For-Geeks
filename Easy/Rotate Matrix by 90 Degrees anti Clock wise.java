

//Time Complexity - O(n^2)
//Auxilary Space - O(n^2)




public class Main
{
	public static void main(String[] args) {
		int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		Solve(arr);
	}
	static void Solve(int[][] arr){
	    int r=arr.length;
	    int c=arr[0].length;
	    int[][] temp=new int[r][c];
	    for(int i=0;i<r;i++){
	        for(int j=0;j<c;j++){
	            temp[i][j] = arr[j][c-i-1];
	        }
	    }
	    for(int i=0;i<r;i++){
	        for(int j=0;j<c;j++){
	            System.out.print(temp[i][j]+" ");
	        }
	        System.out.println();
	    }
	}
}
