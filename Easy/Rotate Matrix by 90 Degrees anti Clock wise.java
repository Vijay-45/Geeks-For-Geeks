

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

_____________________________________________________________________________________________________________________________________________________________________________


//Time Complexity - O(n^2)
//Auxilary Space - O(1)





class Solution
{
    //Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int arr[][], int n) 
    { 
        // code here
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            int low=0,high=n-1;
            while(low<high){
                temp=arr[low][i];
                arr[low][i]=arr[high][i];
                arr[high][i]=temp;
                low++;high--;
            }
        }
    }
}



