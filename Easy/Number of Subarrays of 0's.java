

//Time Complexity - O(n)
//AuxialrySpace - O(1)



class Solution{
	long no_of_subarrays(int n, int [] arr) {
		//Write your code here
		
		long ans=0;
		long count=0;
		for(int i=0;i<n;i++){
		    if(arr[i]==0){
		        count++;
		    }
		    else{
		        ans+=(count*(count+1))/2;
		        count=0;
		    }
		}
		ans+=(count*(count+1))/2;
		return ans;
	}
}
