class Solution {
    public static int solve(int N, int K, int[] arr) {
        // code here
        int sum=0;
        for(int i=0;i<N;i++){
            sum+=arr[i];
        }
        ArrayList<Integer> facts=new ArrayList<>();
        for(int i=1;i*i<=sum;i++){
            if(sum%i==0){
                facts.add(i);
                if(i!=sum/i){
                    facts.add(sum/i);
                }
            }
        }
        Collections.sort(facts);
        int ans=1;
        for(int i=1;i<N;i++){
            arr[i]=arr[i]+arr[i-1];
        }
        for(int i=facts.size()-1;i>=0;i--){
            int count=0;
            for(int j=0;j<N;j++){
                if(arr[j] % facts.get(i)==0){
                    count++;
                }
            }
            if(count>=K){
                ans=facts.get(i);
                break;
            }
        }
        return ans;
    }
}
        
