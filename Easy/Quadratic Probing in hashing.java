

//Time Complexity - O(n)
//Auxilary space - O(1)





class Solution{
    //Function to fill the array elements into a hash table 
    //using Quadratic Probing to handle collisions.
    static void quadraticProbing(int[] hash, int size, int arr[], int n)
    {
        //Your code here
        Arrays.fill(hash,-1);
        int temp=0;
        for(int i=0;i<n;i++){
            int p=1;
            temp=arr[i]%size;
            int pos=temp;
            while(hash[temp]!=-1 && hash[temp]!=arr[i]){
                temp=(pos+p*p)%size;
                p++;
            }
            if(hash[temp]==-1){
                hash[temp]=arr[i];
            }
        }
        
    }
}
