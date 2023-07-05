

//Time Complexity - O(n)
//Auxilary Space - O(1)




class Solution
{
    int atoi(String s) {
        int n=s.length();
        int res=0;
        boolean flag=false;
        for(int i=0;i<n;i++){
            if(i==0 && (s.charAt(i)-'0')<0){
                flag=true;
            }
            else if((s.charAt(i)-'0')>=0 && (s.charAt(i)-'0')<=9){
                res=(res*10)+(s.charAt(i)-'0');
            }
            else{
                return -1;
            }
        }
        if(flag){
            return (-res);
        }
        return res;
    }
}
