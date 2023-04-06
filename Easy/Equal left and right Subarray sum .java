

//Time Complexity - O(n)
//Auxilary Space - O(1)



class Solution{
	int equalSum(int [] arr, int n) {
		//Write your code here
		int sum=0,l=0;
		for(int i=0;i<n;i++){
		    sum+=arr[i];
		}
		for(int i=0;i<n;i++){
		    sum-=arr[i];
		    if(l==sum){
		        return i+1;
		    }
		    l+=arr[i];
		}
		return -1;
	}
}
