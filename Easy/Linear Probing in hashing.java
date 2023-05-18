

//Time Complexity - O(n)
//Auxilary Space - O(1)



class Solution{
    //Function to fill the array elements into a hash table 
    //using Linear Probing to handle collisions.
    int[] linearProbing(int size, int arr[], int n)
    {
        //Your code here
        int temp=0;
        int[] res=new int[size];
        Arrays.fill(res,-1);
        for(int i=0;i<n;i++){
            temp=arr[i]%size;
            if(res[temp]==-1){
                res[temp]=arr[i];
            }
            else{
                int count=0;
                while(res[temp]!=-1 && count<=size){
                    if(res[temp]==arr[i]) break;
                    temp=(temp+1)%size;
                    count++;
                }
                if(res[temp]==-1){
                    res[temp]=arr[i];
                }
            }
        }
        return res;
        
    }
}
