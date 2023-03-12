


//Time Complexity - O(n)
//Auxialry Space - O(1)



class Solution
{
    //Function to return the maximum water that can be stored.
    static int maxWater(int arr[], int n) 
    { 
        //Your code here
        int l=0,h=n-1;
        int res=0;
        while(l<h){
            res=Math.max(res,Math.min(arr[l],arr[h])*(h-(l+1)));
            if(arr[l]<arr[h]){
                l++;
            }
            else{
                h--;
            }
        }
        return res;
    } 

}
