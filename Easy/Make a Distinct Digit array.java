

//Time Complexity - O(n)
//Auxilary Space - O(1)




class Solution
{
    public int[] common_digits(int[] arr)
    {
        // code here
        int n=arr.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            int temp=arr[i];
            while(temp>0){
                int r=temp%10;
                temp/=10;
                set.add(r);
            }
        }
        int size = set.size();
        int[] res=new int[size];
        int index=0;
        for(int x:set){
            res[index++]=x;
        }
        
        return res;
    }
}
