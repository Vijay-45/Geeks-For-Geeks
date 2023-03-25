

//Time Complexity - O(m+n)
//Auxilary Space - O(min(m+n))



class Solution
{
    //Function to return a list containing the intersection of two arrays.
    static ArrayList<Integer> printIntersection(int arr[], int arr1[], int n, int m) 
    {
        // add your code here
        ArrayList<Integer> list = new ArrayList<>();
        
        int i=0,j=0;
        while(i<n && j<m){
            if(i>0 && arr[i]==arr[i-1]){
                i++;
                continue;
            }
            if(arr[i]<arr1[j]){
                i++;
            }
            else if(arr[i]>arr1[j]){
                j++;
            }
            else{
                list.add(arr[i]);
                i++;
                j++;
            }
        }
        if(list.isEmpty()){
            list.add(-1);
            return list;
        }
        return list;
    }

}

