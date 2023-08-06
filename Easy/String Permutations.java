

//Time Complexity - O(n!)
//Auxilary Space - O(n)


class Solution
{
    public ArrayList<String> permutation(String s)
    {
        //Your code here
        char[] arr=s.toCharArray();
        ArrayList<String> list=new ArrayList<>();
        Solve(arr,0,list);
        Collections.sort(list);
        return list;
    }
    void Solve(char[] arr,int index,ArrayList<String> res){
        if(index>=arr.length){
            res.add(String.valueOf(arr));
            return;
        }
        for(int i=index;i<arr.length;i++){
            Swap(i,index,arr);
            Solve(arr,index+1,res);
            Swap(i,index,arr);
        }
    }
    void Swap(int a,int b,char[] arr){
        char temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
	   
}
