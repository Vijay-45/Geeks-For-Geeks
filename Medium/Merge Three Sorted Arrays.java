


//Time Complexity - O(n1+n2+n3)
//AuxilarySpce  - O(n1+n2+n3)


class Solution
{
    // A[], B[], C[]: input arrays
    //Function to merge three sorted lists into a single list.
    static ArrayList<Integer> merge3sorted(int a[], int b[], int c[])
    {
        // add ypur code here
        int n1=a.length,n2=b.length,n3=c.length;
        int i=0,j=0,l=0,s=0,k=0,k1=0;
        int[] temp=new int[n1+n2];
        int[] res=new int[n1+n2+n3];
        int len=temp.length;
        int resLen=res.length;
        ArrayList<Integer> list = new ArrayList<>();
        
        while(i<n1 && j<n2){
            if(a[i]<=b[j]){
                temp[k1++]=a[i++];
            }
            else{
                temp[k1++]=b[j++];
            }
        }
        while(i<n1){
            temp[k1++]=a[i++];
        }
        while(j<n2){
            temp[k1++]=b[j++];
        }
        
        
        while(s<len && l<n3){
            if(temp[s]<=c[l]){
                res[k++]=temp[s++];
            }
            else{
                res[k++]=c[l++];
            }
        }
        while(s<len){
            res[k++]=temp[s++];
        }
        while(l<n3){
            res[k++]=c[l++];
        }
        
        
        for(int p=0;p<resLen;p++){
            list.add(res[p]);
        }
        
        return list;
    }
}
