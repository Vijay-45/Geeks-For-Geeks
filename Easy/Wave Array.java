 //Time Complexity - O(n)
//Auxilary Space - O(1)


class Solution {
    public static void convertToWave(int n, int[] a) {
        // code here
        int temp=0;
        for(int i=0;i<n;i=i+2){
            if(i==(n-1)){
                break;
            }
            temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
        }
        
    }
}
        
