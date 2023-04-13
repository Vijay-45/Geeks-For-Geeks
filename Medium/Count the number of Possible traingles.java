

//Time Complexity - O(n^2)
//Auxilary Space - O(1)



class Solution
{
    //Function to count the number of possible triangles.
    static int findNumberOfTriangles(int arr[], int n)
    {
        // code here
        int ans=0;
        Arrays.sort(arr);
        for(int i=n-1;i>=2;i--){
           
            int l=0,h=i-1;
            while(l<h){
                if((arr[l]+arr[h])>arr[i]){
                    ans+=h-l;
                    h--;
                }
                else{
                    l++;
                }
            }
        }
        return ans;
    }
}
