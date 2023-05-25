

//Time Complexity - O(n)
//Auxilary Space - O(n)




class Solution
{
    //Function to return list containing all the pairs having both
    //negative and positive values of a number in the array.
    public static ArrayList<Integer>findPairs(int arr[], int n) 
    { 
    	// code here.
    	HashSet<Integer> set = new HashSet<>();
    	ArrayList<Integer> list = new ArrayList<>();
    	for(int i=0;i<n;i++){
    	    int temp=arr[i]*(-1);
    	    if(set.contains(temp)){
    	        if(arr[i]<0){
    	            list.add(arr[i]);
    	            list.add(temp);
    	        }
    	        else{
    	            list.add(temp);
    	            list.add(arr[i]);
    	        }
    	    }
    	    else{
    	        set.add(arr[i]);
    	    }
    	}
    	return list;
    }
}
