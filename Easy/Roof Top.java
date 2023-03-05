

//Time Complexity - O(n)
//Auxilary Space - O(1)


class Solution
{
    //Function to find maximum number of consecutive steps 
    //to gain an increase in altitude with each step.
    static int maxStep(int arr[], int n)
    {
        // Your code here
        int count=0;
        int res=0;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){
                count++;
                res=Math.max(res,count);
            }
            else{
                count=0;
            }
        }
        return res;
    
    }
    
}
