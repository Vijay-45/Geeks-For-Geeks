

//Time Complexity - O(n)
//Auxilary Space - O(n)





class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> list=new ArrayList<>();
        int[] res=new int[n];
        int ans=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>=ans){
                ans=arr[i];
                list.add(ans);
            }
        }
        Collections.reverse(list);
        return list;
    }
}
