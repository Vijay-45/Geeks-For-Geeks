

//Time Complexity - O(n^2)
//Auxilary Space - O(1)


public class Main
{
	public static void main(String[] args) {
		int[] a={2,3,4,5};
		int[] b={1,2,3};
		System.out.println(Solve(a,b));
		
	}
	static int Solve(int[] a,int[] b){
	    int n=a.length;
	    int m=b.length;
	    int count=0;
	    
	    for(int i=0;i<n;i++){
	        for(int j=0;j<m;j++){
	            if((Math.pow(a[i],b[j])>Math.pow(b[j],a[i]))){
	                count++;
	            }
	        }
	    }
	    return count;
	}
}




____________________________________________________________________________________________________________________________



//Time Complexity -O((n+m)Logn)
//Auxilary Space - O(1)





class Solution
{
    
    // x[], y[]: input array elements
    // M, N: size of arrays x[] and y[] respectively
    //Function to count number of pairs such that x^y is greater than y^x.
    static long countPairs(int a[], int b[], int n, int m)
    {
        // your code here
        Arrays.sort(a);
        Arrays.sort(b);
        
        int zeros=0,one=0,three=0,four=0,two=0;
        for(int i=0;i<m;i++){
            if(b[i]==0) zeros++;
            if(b[i]==1) one++;
            if(b[i]==3) three++;
            if(b[i]==4) four++;
            if(b[i]==2) two++;
        }
        
        long count=0;
        for(int i=0;i<n;i++){
            if(a[i]==0) continue;
            else if(a[i]==1){
                count+=zeros;
            }
            else if(a[i]==2){
                int index = getIndex(b,m,2);
                if(index!=-1){
                    count+=m-index;
                }
                count-=three;
                count-=four;
                count+=one;
                count+=zeros;
            }
            else{
                int index = getIndex(b,m,a[i]);
                if(index!=-1){
                    count+=m-index;
                }
                count+=one;
                count+=zeros;
                if(a[i]==3){
                    count+=two;
                }
            }
        }
        return count;
    }
    static int getIndex(int[] arr,int n,int ele){
        int l=0,h=n-1;
        int ans=-1;
        while(l<=h){
            int mid = (l+h)/2;
            if(arr[mid]>ele){
                ans=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
}
