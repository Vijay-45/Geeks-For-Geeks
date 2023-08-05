

//Time Complexity - O(nlogn)
//Auxilary Space - O(1)




class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        long res=Long.MAX_VALUE;
        Collections.sort(a);
        res=Math.min(res,a.get(m-1)-a.get(0));
        for(int i=m;i<n;i++){
            res=Math.min(res,a.get(i)-a.get(i-m+1));
        }
        return res;
    }
}
