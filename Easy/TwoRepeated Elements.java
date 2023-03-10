

//Time Complexity - O(n)
//Auxialry Space - O(1)

class Solution
{
    //Function to find two repeated elements.
    public int[] twoRepeated(int arr[], int N)
    {
        // Your code here
        int[] res=new int[2];
        int k=0;
        for(int i=0;i<N+2;i++){
            if(arr[Math.abs(arr[i])] > 0){
                arr[Math.abs(arr[i])]*=-1;
            }
            else{
                res[k++]=Math.abs(arr[i]);
            }
        }
        return res;
        
    }
    
}
