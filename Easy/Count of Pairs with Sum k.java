

//Time Complexity - O(nlogn)
//Auxialry Space - O(1)




public class Main
{
	public static void main(String[] args) {
		int[] arr={1,4,4,5,5,6,6,11};
		int k=11;
		System.out.println(Solve(arr,k));
	}
	static int Solve(int[] arr,int k){
	    int n=arr.length;
	    int l=0,h=n-1;
	    int count=0,c1=1,c2=1;
	    while(l<h){
	        if((arr[l]+arr[h])==k){
	            int temp=arr[l];
	            while(arr[++l]==temp){
	                c1++;
	            }
	            int temp1=arr[h];
	            while(arr[--h]==temp1){
	                c2++;
	            }
	            count=c1*c2;
	        }
	        else if((arr[l]+arr[h]) > k){
	            h--;
	        }
	        else{
	            l++;
	        }
	    }
	    return count;
	}
}
______________________________________________________________________________________________________________________________


//Time Complexity - O(n)
//Auxilary Space - O(n)




class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here\
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int temp=k-arr[i];
            if(map.containsKey(temp)){
                count+=map.get(temp);
            }
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        return count;
    }
}

