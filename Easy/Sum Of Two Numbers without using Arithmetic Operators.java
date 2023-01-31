class Solution
{
    int sum(int a , int b)
    {
        //code here
        int c=a&b;
        int r=a^b;
        while(c!=0){
            int s=c<<1;
            c=r&s;
            r=r^s;
        }
        return r;
    }
}
