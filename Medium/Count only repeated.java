

//Time Complexity - O(logn)
//Auxialry Space - O(1)


class Solution
{
    // Pair Class
    static class Pair{
         long x;
         long y;
         
         Pair(long x, long y){
             this.x = x;
             this.y = y;
         }
     }
    //Function to find repeated element and its frequency.
    public static Pair findRepeating(Long arr[],int n)
    {
        //Your code here
        int l=0,h=n-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]>=arr[0]+mid){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        long res=n-(arr[n-1]-arr[0]);
        if(res==1) return new Pair(-1,-1);
        else{
            return new Pair(arr[l],res);
        }
    }
  
};
