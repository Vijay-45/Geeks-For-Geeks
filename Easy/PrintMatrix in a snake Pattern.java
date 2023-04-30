

//Time Complexity - O(r*c)
//Auxilary Space - O(1)




class Solution
{
    //Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int arr[][])
    {
        // code here 
        ArrayList<Integer> list=new ArrayList<>();
        int r=arr.length;
        int c=arr[0].length;
        for(int i=0;i<r;i++){
            if(i%2==0){
                for(int j=0;j<c;j++){
                    list.add(arr[i][j]);
                }
            }
            else{
                for(int j=c-1;j>=0;j--){
                    list.add(arr[i][j]);
                }
            }
        }
        return list;
    }
}
