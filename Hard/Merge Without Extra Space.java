

//Time Complexity - O((n+m)log(n+m))
//Auxilary Space - O(1)


class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
        int i=n-1,j=0;
        long temp=0;
        while(i>=0 && j<m){
            if(arr1[i]>=arr2[j]){
                temp=arr1[i];
                arr1[i]=arr2[j];
                arr2[j]=temp;
            }
            i--;
            j++;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
