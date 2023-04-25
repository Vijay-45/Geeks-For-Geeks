

//Time Complexity - O(nlogn)
//Auxilary Space - O(k)




class Solution {
    int[] kLargest(int[] arr, int n, int k) {
        // code here
        int[] ans=new int[k];
        int[] ans1= new int[k];
        int res=0;
        int index=0;
        int l=0,h=n-1;
        while(l<=h){
            int p = Partition(arr,l,h);
            if(p==(n-k)){
                res=n-k;
                break;
            }
            else if(p<(n-k)) l=p+1;
            else{
                h=p-1;
            }
        }
        for(int i=n-1;i>=res;i--){
            ans[index++]=arr[i];
        }
        index=0;
        Arrays.sort(ans);
        int m=ans.length;
        for(int i=0;i<k;i++){
            ans1[index++]=ans[(m-i)-1];
        }
        return ans1;
    
    }
    static int Partition(int[] arr,int l,int h){
        int p = arr[h];
        int i=l-1;
        int temp=0;
        for(int j=l;j<h;j++){
            if(arr[j]<p){
                i++;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        temp=arr[i+1];
        arr[i+1]=p;
        arr[h]=temp;
        
        
        
        return i+1;
        
    }
}
