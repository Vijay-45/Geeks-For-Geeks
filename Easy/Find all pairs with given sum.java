

//Time Complexity - O(nlogn)
//Auxilary Space - O(n)



class Solution {
    public pair[] allPairs( long A[], long B[], long n, long m, long k) {
        // Your code goes here 
        ArrayList<pair> list = new ArrayList<>();
        Arrays.sort(A);
        Arrays.sort(B);
        
        int l=0,h=(int)m-1;
        while(l<n && h>=0){
            long sum=A[l]+B[h];
            if(sum==k){
                list.add(new pair(A[l],B[h]));
                l++;h--;
            }
            else if(sum<k){
                l++;
            }
            else{
                h--;
            }
        }
        int size=list.size();
        pair[] p =new pair[size];
        for(int i=0;i<size;i++){
            p[i]=new pair(list.get(i).first,list.get(i).second);
        }
        return p;
        
    }
}
