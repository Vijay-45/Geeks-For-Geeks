

//Time Complexity - O(n1+n2+n3)
//Auxilary Space - O(1)




class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here 
        ArrayList<Integer> list=new ArrayList<>();
        int i=0,j=0,k=0;
        while(i<n1 && j<n2 && k<n3){
            if(A[i] == B[j] && B[j] == C[k]){
                if(!list.contains(A[i])){
                    list.add(A[i]);
                }
                i++;j++;k++;
            }
            else if(A[i]<=B[j] && A[i]<=C[k]){
                i++;
            }
            else if(B[j]<=A[i] && B[j]<=C[k]){
                j++;
            }
            else{
                k++;
            }
        }
        return list;
    }
}
