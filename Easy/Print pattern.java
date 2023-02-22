

//Time Complexity - O(n)
//Auxilary Space - O(1)


class Solution{
    static List<Integer> pattern(int N){
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        Print_1(N,list);
        Print_2(N,list);
        return list;
    }
    static int Print_1(int n,ArrayList<Integer> list){
        list.add(n);
        if(n<=0){
            return n;
        }
         return Print_1(n-5,list);
    }
    static void Print_2(int n,ArrayList<Integer> list){
        if(n<=0){
            return ;
        }
        Print_2(n-5,list);
        list.add(n);
    }
}
