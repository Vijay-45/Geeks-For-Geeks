


//Time Complexity - O(nlogn)
//Auxilary Space - O(1)



class Solution
{
    //Function to find the kth smallest element in the array.
    public static int kthSmallest(int arr[], int n, int k)
    {
        // Your code here
        int l=0,h=n-1;
        while(l<=h){
            int p=Partition(arr,l,h);
            
            if(p==k-1) return arr[p];
            else if(p<k-1) l=p+1;
            else{
                h=p-1;
            }
        }
        return -1;
    }
    static int Partition(int[] arr,int l,int h){
        int p=arr[h];
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
        arr[i+1] = p;
        arr[h]=temp;
        
        return i+1;
    }
}
