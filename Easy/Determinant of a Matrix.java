//Time Complexity - O(n^4)
//Auxilary Space - O(n^2)




class Solution
{
    //Function for finding determinant of matrix.
    static int determinantOfMatrix(int mat[][], int n)
    {
        // code here 
        int D=0;
        if(n==1) return mat[0][0];
        int sign=1;
        
        int[][] temp=new int[n][n];
        
        for(int i=0;i<n;i++){
            getFactor(mat,temp,0,i,n);
            D+=sign*mat[0][i]*determinantOfMatrix(temp,n-1);
            
            sign=-sign;
        }
        return D;
    }
    static void getFactor(int[][] mat,int[][] temp,int p,int q,int n){
        int i=0,j=0;
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                if(row!=p && col!=q){
                    temp[i][j++]=mat[row][col];
                    
                    if(j==n-1){
                        j=0;
                        i++;
                    }
                }
            }
        }
    }
}

