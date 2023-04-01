

//Time Complexity - O(n)
//Auxilary Space - O(1)




class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int l=0,m=0,h=n-1;
        int temp=0;
        while(m<=h){
            switch(a[m]){
                case 0:
                    temp=a[m];
                    a[m]=a[l];
                    a[l]=temp;
                    l++;m++;
                    break;
                case 1:
                    m++;
                    break;
                case 2:
                    temp=a[m];
                    a[m]=a[h];
                    a[h]=temp;
                    h--;
                    break;
            }
        }
    }
    
}
