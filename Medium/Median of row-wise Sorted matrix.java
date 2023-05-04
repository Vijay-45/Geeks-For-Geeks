
//Time Complexity - O(r*log(max-min)*logc)
//Auxilary Space - O(1)



import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[][] arr={{5,10,20,30,40},{1,2,3,4,6},{11,13,15,17,19}};
		System.out.println(Solve(arr));
	}
	static int Solve(int[][] arr){
	    int r=arr.length;
	    int c=arr[0].length;
	    int min=arr[0][0],max=arr[0][c-1];
	    for(int i=1;i<r;i++){
	        if(arr[i][0]<min){
	            min=arr[i][0];
	        }
	        if(arr[i][c-1]>max){
	            max=arr[i][c-1];
	        }
	    }
	    int medPos = (r*c+1)/2;
	    while(min<max){
	        int mid = (min+max)/2;
	        int midPos=0;
	        int pos=0;
	        for(int i=0;i<r;i++){
	            pos=Arrays.binarySearch(arr[i],mid);
	            if(pos<0){
	                pos=Math.abs(pos)-1;
	            }
	            else{
	                if(pos<arr[i].length && arr[i][pos]==mid){
	                    pos+=1;
	                }
	            }
	            midPos=midPos+pos;
	        }
	        if(midPos<medPos){
	            min=mid+1;
	        }
	        else{
	            max=mid;
	        }
	    }
	    return min;
	}
}
