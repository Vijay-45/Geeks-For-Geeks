

//Time Compexity - O(n+m)
//Auxilary Space - O(n+m)



public class Main
{
	public static void main(String[] args) {
		int[] arr={10,20,30,40,50};
		int[] arr1={5,15,25,35,45};
		Solve(arr,arr1);
	}
	public static void Solve(int[] arr,int[] arr1){
	   int n=arr.length;
	   int m=arr1.length;
	   int[] res=new int[n+m];
	   int index=0,i=0,j=0;
	   while(i<n && j<m){
	       if(arr[i]<arr1[j]){
	           res[index++]=arr[i++];
	       }
	       else if(arr[i]>arr1[j]){
	           res[index++]=arr1[j++];
	       }
	   }
	   while(i<n){
	       res[index++]=arr[i++];
	   }
	   while(j<m){
	       res[index++]=arr1[j++];
	   }
	   for(int k:res){
	       System.out.print(k+" ");
	   }
	   System.out.println(" ");
	   int t=res.length/2;
	   double ans=0;
	   if((res.length)%2==0){
	       ans=(double)(res[t]+res[t-1])/2;
	   }
	   else{
	       ans=(double)res[t];
	   }
	   System.out.println(ans);
	}
}

______________________________________________________________________________________________________________________________


//Time Complexity - O(log(max(m,n))
//Auxialry Space - O(1)






class Solution
{
    //Function to find the median of the two arrays when they get merged.
    public static int findMedian(int arr[], int n, int arr1[], int m)
    {
        //Your code here
        int l=0,r=n;
        while(l<=r){
            int i1=(l+r)/2;
            int i2=((n+m+1)/2)-i1;
            
            int min1=(i1==n)?Integer.MAX_VALUE : arr[i1];
            int max1=(i1==0)?Integer.MIN_VALUE : arr[i1-1];
            int min2=(i2==m)?Integer.MAX_VALUE : arr1[i2];
            int max2=(i2==0)?Integer.MIN_VALUE : arr1[i2-1];
            
            if((max1<=min2) && (max2<=min1)){
                if((n+m)%2==0){
                    return ((Math.max(max1,max2))+(Math.min(min1,min2)))/2;
                }
                return Math.max(max1,max2);
            }
            else if(max1>min2) r=i1-1;
            else{
                l=i1+1;
            }
        }
        return 0;
    }
}
