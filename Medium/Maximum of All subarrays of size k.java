

//Time Complexity - O(n*k)
//Auxilary Space - O(n)



class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        int mx=0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n-(k-1);i++){
            mx=arr[i];
            for(int j=i+1;j<i+k;j++){
                mx=Math.max(mx,arr[j]);
            }
            list.add(mx);
        }
        return list;
    }
}
