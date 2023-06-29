

//Time Complexity  - O(n)
//Auxilary Space - O(26)





class Solution
{
    public String arrangeString(String s)
        {
            //code here.
            int n=s.length();
            int count=0;
            String res="";
            int[] arr=new int[26];
            for(int i=0;i<n;i++){
                if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                    arr[s.charAt(i)-'A']++;
                }
                else{
                    count+=s.charAt(i)-'0';
                }
            }
            for(int i=0;i<26;i++){
                if(arr[i]>0){
                    for(int j=0;j<arr[i];j++){
                        res=res+(char)(i+'A');
                    }
                }
            }
            if(count!=0){
                res=res+String.valueOf(count);
            }
            return res;
        }
}
