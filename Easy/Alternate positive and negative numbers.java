

//Time Complexity - O(n)
//Auxilary Space - O(n)




class Solution {
    void rearrange(int arr[], int n) {
        // code here
        int index=0;
        int l=0,k=0;
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                pos.add(arr[i]);
            }
            else{
                neg.add(arr[i]);
            }
        }
        int n1=pos.size();
        int n2 = neg.size();
        while(l<n1 && k<n2){
            if(index%2==0){
                arr[index++]=pos.get(l++);
            }
            else{
                arr[index++]=neg.get(k++);
            }
        }
        while(l<n1){
            arr[index++]=pos.get(l++);
        }
        while(k<n2){
            arr[index++]=neg.get(k++);
        }
    }
}
