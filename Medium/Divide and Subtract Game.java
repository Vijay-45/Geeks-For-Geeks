

//Time Complexity - O(n)
//Auxilary Space - O(n)


class Solution {
    static String divAndSub(int num) {
        // code here
       if(num==1){
           return "Arya";
       }
       int[] temp=new int[num+1];
       int[] mov={2,3,4,5};
       temp[0]=1;
       for(int i=6;i<=num;i++){
           int win=0;
           for(int k:mov){
               if(i-k>=0){
                   win |=temp[i-k];
               }
               win |=temp[i/k];
           }
           temp[i] = win^1;
       }
       if(temp[num]==1){
           return "Arya";
       }
       return "Jon";
    }
};
