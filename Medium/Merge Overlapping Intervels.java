

//Time Complexity - O(nlogn)
//Auxilary Space - O(1)

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Intervel[] arr={new Intervel(5,10),new Intervel(1,7),new Intervel(6,7),new Intervel(2,3)};
	    
	    Arrays.sort(arr,new myComp());
	    int res=0;
	    for(int i=1;i<arr.length;i++){
	        if(arr[res].end>=arr[i].start){
	            arr[res].end=Math.max(arr[res].end,arr[i].end);
	            arr[res].start=Math.min(arr[res].start,arr[i].start);
	        }
	        else{
	            res++;
	            arr[res]=arr[i];
	        }
	    }
	    for(int j=0;j<=res;j++){
	        System.out.println(arr[j].start+" "+arr[j].end);
	    }
	   
	}
}
class Intervel{
    int start,end;
    public Intervel(int start,int end){
        this.start=start;
        this.end=end;
    }
}
class myComp implements Comparator<Intervel>{
    public int compare(Intervel i1,Intervel i2){
        return i1.start - i2.start;
    }
}
