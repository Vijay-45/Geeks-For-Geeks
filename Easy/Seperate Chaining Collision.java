

//Time Complexity - O(n)
//Auxilary Space - O(n)




class Solution{

    //Function to insert elements of array in the hashTable avoiding collisions.
    public ArrayList<ArrayList<Integer>> separateChaining(int arr[], int n, int Buk)
    {
        //Your code here
        ArrayList<ArrayList<Integer>> table = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<Buk;i++){
            table.add(new ArrayList<Integer>());
        }
        for(int i=0;i<n;i++){
            int j=arr[i]%Buk;
            table.get(j).add(arr[i]);
        }
        return table;
    }
}
