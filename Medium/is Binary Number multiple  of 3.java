

//Time Complexity - O(n)
//Auxilary Space - O(1)



class Solution {
    int isDivisible(String s) {
        // code here
        int n=s.length();
        int odd=0,even=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                if(i%2==0) even++;
                else{
                    odd++;
                }
            }
        }
        if((odd-even)%3==0){
            return 1;
        }
        return 0;
    }
}
