

//Time compleixty - O(n^2)
//Auxilary Space - O(1)


class Solution
{
    //Function to return sum of upper and lower triangles of a matrix.
    static ArrayList<Integer> sumTriangles(int arr[][], int n)
    {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int sum=0,sum1=0;
        for(int i=0;i<n;i++){
            sum+=arr[i][i];
            for(int j=i+1;j<n;j++){
                sum+=arr[i][j];
            }
        }
        list.add(sum);
        for(int i=n-1;i>=0;i--){
            sum1+=arr[i][i];
            for(int j=i-1;j>=0;j--){
                sum1+=arr[i][j];
            }
        }
        list.add(sum1);
        
        return list;
    }
}
