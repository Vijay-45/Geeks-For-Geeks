

//Time Complexity - O(n*max)
//Auxilary Space - O(max)


class Solution{
    //Function to find the maximum occurred integer in all ranges.
    public static int maxOccured(int L[], int R[], int n, int max){
        int[] arr=new int[max+1];
        int[] temp=new int[n*2];
        int res=0;
        int index=0;
        for(int i=0;i<n;i++){
            temp[index++]=L[i];
            temp[index++]=R[i];
        }
        
        for(int i=0;i<temp.length;i=i+2){
            for(int j=temp[i];j<=temp[i+1];j++){
                    arr[j]++;
            }
        }
        
        for(int i=0;i<arr.length;i++){
            res=Math.max(res,arr[i]);
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==res){
                return i;
            }
        }
        return 0;
        _____________________________________________________________________________________________________________________________________________________________
            
            
       //Time Complexity - O(n+max)
       //Auxilary Space - O(max)
            
            
      public class Main
{
	public static void main(String[] args) {
		int[] l={1,2,4};
		int[] r={4,5,7};
		int max=0;
		for(int i=0;i<r.length;i++){
		    max=Math.max(r[i],max);
		}
		Solve(l,r,max);
	}
	static void Solve(int[] l,int[] r,int max){
	    int n=l.length;
	    int res=0;
	    int[] temp=new int[max+2];
	    for(int i=0;i<n;i++){
	        temp[l[i]]++;
	        temp[r[i]+1]--;
	    }
	    
	    for(int i=1;i<temp.length;i++){
	        temp[i]=temp[i]+temp[i-1];
	        res=Math.max(res,temp[i-1]);
	    }
	    System.out.println(res);
	    
	    
	}
}

        
        
    }
    
}
