

//Time Compplexity - O(n)
//Auxilary Space - O(1)




class Solve {
    // m is maximum of number zeroes allowed to flip
    int findZeroes(int arr[], int n, int m) {
        // code here
        int count =0,start=0,zeroCount=0;
        for(int end=0;end<n;end++){
            if(arr[end]==0) zeroCount++;
            while(zeroCount>m){
                if(arr[start]==0) zeroCount--;
                start++;
            }
            count=Math.max(count,end-start+1);
        }
        return count;
    }
}
