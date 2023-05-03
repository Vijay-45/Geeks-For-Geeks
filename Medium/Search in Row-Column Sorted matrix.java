

//Time Complexity - O(r*c)
//Auxilary Space - O(1)


public class Main
{
	public static void main(String[] args) {
		int[][] arr={{10,20,30,40},{15,25,35,45},{27,29,3,48},{32,33,39,50}};
		int k=32;
		Solve(arr,k);
	}
	static void Solve(int[][] arr,int k){
	    int r=arr.length;
	    int c=arr[0].length;
	    
	    for(int i=0;i<r;i++){
	        for(int j=0;j<c;j++){
	            if(arr[i][j]==k){
	                System.out.println(i+" "+j);
	                return;
	            }
	        }
	    }
	}
}

_____________________________________________________________________________________________________________________________________________________________________________



//Time Complexity - O(r+c)
//Auxilary Space - O(1)


class Solution 
{ 
    //Function to search a given number in row-column sorted matrix.
	static boolean search(int matrix[][], int n, int m, int x) 
	{  
	    // code here 
	    int top=0,right=m-1;
	    while(top<n && right>=0){
	        if(matrix[top][right]==x){
	            return true;
	        }
	        else if(matrix[top][right]>x){
	            right--;
	        }
	        else{
	            top++;
	        }
	    }
	    return false;
	} 
} 

