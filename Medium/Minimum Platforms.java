

//Time Complexity - O(nlogn)
//Auxilary Space - O(1)



class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int i=1,j=0,res=1,curr=1;
        while(i<n && j<n){
            if(arr[i]<=dep[j]){
                curr++;i++;
            }
            else{
                curr--;j++;
            }
            res=Math.max(res,curr);
        }
        return res;
        
    }
    
}

