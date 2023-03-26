

//Time Complexity - O((m+n)*log(m+n))
//Auxilary Space - O(m+n)



import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] arr = {3,5,8};
		int[] arr1 = {2,8,9,10,15};
		Solve(arr,arr1);
 	}
 	static void Solve(int[] arr,int[] arr1){
 	    int n=arr.length;
 	    int n1 =arr1.length;
 	    int[] res=new int[n+n1];
 	    for(int i=0;i<n;i++){
 	        res[i]=arr[i];
 	    }
 	    for(int i=0;i<n1;i++){
 	        res[i+n]=arr1[i];
 	    }
 	    Arrays.sort(res);
 	    for(int i=0;i<res.length;i++){
 	        if(i==0 || res[i]!=res[i-1]){
 	            System.out.print(res[i]+" ");
 	        }
 	    }
 	}
}

______________________________________________________________________________________________________________________________



//Time Complexity - O(m+n)
//Auxilary Space - O(m+n)




class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        int i=0,j=0;
        ArrayList<Integer> list = new ArrayList<>();
        while(i<n && j<m){
            if(i>0 && arr1[i]==arr1[i-1]){
                i++;
                continue;
            }
            if(j>0 && arr2[j]==arr2[j-1]){
                j++;
                continue;
            }
            if(arr1[i]<arr2[j]){
                list.add(arr1[i]);
                i++;
            }
            else if(arr1[i]>arr2[j]){
                list.add(arr2[j]);
                j++;
            }
            else{
                list.add(arr1[i]);
                i++;j++;
            }
        }
        while(i<n){
            if(i==0 || arr1[i]!=arr1[i-1]){
                list.add(arr1[i]);
                
            }
            i++;
        }
        while(j<m){
            if(j==0 || arr2[j]!=arr2[j-1]){
                list.add(arr2[j]);
            }
            j++;
        }
        return list;
    }
}




