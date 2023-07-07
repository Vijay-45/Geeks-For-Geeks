

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


______________________________________________________________________________________________________________________________________________________________________________


//Gap method it doesn't use any Sorting build-in functions 

//Time Complexity - O((n+m)log(n+m))
//Auxilary Space - O(1)





class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
        int len=n+m;
        int gap=(len/2)+(len%2);
        while(gap>0){
            int left=0;
            int right=left+gap;
            while(right<len){
                //arr1 and arr2
                if(left<n && right>=n){
                    if(arr1[left]>arr2[right-n]){
                        long temp=arr1[left];
                        arr1[left]=arr2[right-n];
                        arr2[right-n]=temp;
                    }
                }
                //arr2 and arr2
                else if(left>=n){
                    if(arr2[left-n]>arr2[right-n]){
                        long temp=arr2[left-n];
                        arr2[left-n]=arr2[right-n];
                        arr2[right-n]=temp;
                    }
                }
                //arr1 and arr1
                else{
                    if(arr1[left]>arr1[right]){
                        long temp=arr1[left];
                        arr1[left]=arr1[right];
                        arr1[right]=temp;
                    }
                }
                left++;right++;
            }
            if(gap==1) break;
            gap=(gap/2)+(gap%2);
        }
    }
}

