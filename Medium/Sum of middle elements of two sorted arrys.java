



//Time Complexity - O(logn)
//Auxilary Space - O(1)



class Solution {
    int findMidSum(int[] arr, int[] arr1, int n) {
        // code here
        int l=0,r=n;
        while(l<=r){
            int i1=(l+r)/2;
            int i2=(n+n+1)/2-i1;
            
            
            int min1=(i1==n)?Integer.MAX_VALUE : arr[i1];
            int max1=(i1==0)?Integer.MIN_VALUE : arr[i1-1];
            int min2=(i2==n)?Integer.MAX_VALUE : arr1[i2];
            int max2=(i2==0)?Integer.MIN_VALUE : arr1[i2-1];
            
            if((max1<=min2) && (max2<=min1)){
                if((n+n)%2==0){
                    return (Math.max(max1,max2))+(Math.min(min1,min2));
                }
                return Math.max(max1,max2);
            }
            else if(max1>min2) r=i1-1;
            else{
                l=i1+1;
            }
        }
        return 0;
    }
}
