class Solution {
    public List<String> find_permutation(String s) {
        // Code here
        List<String> arr=new ArrayList<>();
        Solve(s,arr,0);
        List<String> arr1=new ArrayList<>();
        for(String ele:arr){
            if(!arr1.contains(ele)){
                arr1.add(ele);
            }
        }
        Collections.sort(arr1);
        return arr1;
    }
    void Solve(String s,List<String> arr,int i){
        if(i>=s.length()){
            arr.add(s);
            return;
        }
        for(int j=i;j<s.length();j++){
            s=Get(s,i,j);
            Solve(s,arr,i+1);
            s=Get(s,i,j);
        }
    }
    String Get(String s,int i,int j){
        StringBuilder sb=new StringBuilder(s);
        sb.setCharAt(i,s.charAt(j));
        sb.setCharAt(j,s.charAt(i));
        return (sb.toString());
    }
    public static void main(String[] args){
        String s="ABC";
        System.out.println(find_permutation(s));
    }
}