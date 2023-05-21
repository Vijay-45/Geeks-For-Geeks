
//Time Complexity - O(n)
//Auxilary Space - O(n)



class Geeks {
    // Complete this function
    // Function to check if there is a pair with the given sum in the array.
    public static int sumExists(int arr[], int n, int sum) {
        // Your code here, Geeks
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int tar = sum-arr[i];
            if(map.containsKey(tar)){
                return 1;
            }
            else{
                map.put(arr[i],1);
            }
        }
        return 0;
    }
}
