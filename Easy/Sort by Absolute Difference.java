

//Time Complexity - O(nlogn)
//Space Complexity - O(n)


class Solution
{
    //Function to sort the array according to difference with given number.
    static void sortABS(int arr[], int n,int k)
    {
        // add your code her
        Integer[] a=new Integer[n];
        for(int i=0;i<n;i++){
            a[i]=arr[i];
        }
        Arrays.sort(a,(a1,b1)->{
           return (Math.abs(a1-k)-Math.abs(b1-k)); 
        });
        
        for(int i=0;i<n;i++){
            arr[i]=a[i];
        }
    }
   
}
