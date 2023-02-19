

//Time Complexity - O(n+max)
//Auxilary Space - O(max)


class Solution{
    //Function to find the maximum occurred integer in all ranges.
    public static int maxOccured(int L[], int R[], int n, int max){
        int[] arr=new int[max+1];
        int[] temp=new int[n*2];
        int res=0;
        int index=0;
        for(int i=0;i<n;i++){
            temp[index++]=L[i];
            temp[index++]=R[i];
        }
        
        for(int i=0;i<temp.length;i=i+2){
            for(int j=temp[i];j<=temp[i+1];j++){
                    arr[j]++;
            }
        }
        
        for(int i=0;i<arr.length;i++){
            res=Math.max(res,arr[i]);
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==res){
                return i;
            }
        }
        return 0;
        
        
    }
    
}
