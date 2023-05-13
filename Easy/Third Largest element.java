

//Time Complexity - O(n)
//Auxilary Space - O(1)



class Solution
{
    int thirdLargest(int arr[], int n)
    {
	    // Your code here
	    int first = arr[0];
	    int second=-1;
	    int third=-1;
	    for(int i=1;i<n;i++){
	        if(arr[i]>first){
	            third=second;
	            second=first;
	            first=arr[i];
	        }
	        else if(arr[i]>second){
	            third=second;
	            second=arr[i];
	        }
	        else if(arr[i]>third){
	            third=arr[i];
	        }
	    }
	    return third;
    }
}
