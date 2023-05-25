

//Time Complexity - O(n+m)
//Auxilary Space - o(m)



class Solution {
    // Function to return the count of the number of elements in
    // the intersection of two arrays.
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        // Your code here
        HashSet<Integer> set =new HashSet<>();
        int res=0;
        for(int i=0;i<m;i++){
            set.add(b[i]);
        }
        for(int i=0;i<n;i++){
            if(set.contains(a[i])){
                res++;
                set.remove(a[i]);
            }
        }
        return res;
    }
};
