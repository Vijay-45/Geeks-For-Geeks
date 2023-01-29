class Solution
{
    public int[] singleNumber(int[] nums)
    {
        int res=0;
        for(int i=0;i<nums.length;i++){
            res=res^nums[i];
        }
        int k=(res&(~(res-1)));
        int x=0,y=0;
        for(int i=0;i<nums.length;i++){
            if((nums[i]&k)>0){
                x=x^nums[i];
            }
            else{
                y=y^nums[i];
            }
        }
        int[] result={x,y};
        Arrays.sort(result);
        return result;
        // Code here
    }
}
