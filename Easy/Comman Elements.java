

//Time Complexity - O(n1+n2+n3)
//Auxilary Space - O(n1+n2+n3)



class Solution
{
    ArrayList<Integer> commonElements(int a[], int b[], int c[], int n1, int n2, int n3) 
    {
        // code here 
        ArrayList<Integer> list = new ArrayList<>();
        int i=0,j=0,k=0;
        while(i<n1 && j<n2){
            if(i>0 && a[i]==a[i-1]){
                i++;continue;
            }
            if(j>0 && b[j]==b[j-1]){
                j++;continue;
            }
            if(a[i]<b[j]) i++;
            else if(a[i]>b[j]) j++;
            else{
                list.add(a[i]);
                i++;j++;
            }
        }
        i=0;
        while(i<n1 && k<n3){
            if(i>0 && a[i]==a[i-1]){
                i++;continue;
            }
            if(k>0 && c[k]==c[k-1]){
                j++;continue;
            }
            if(a[i]<c[k]) i++;
            else if(a[i]>c[k]) k++;
            else{
                if(list.contains(a[i])){
                    i++;k++;
                    continue;
                }
                i++;k++;
            }
            
        }
        
        return list;
    }
}
