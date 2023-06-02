

//Time Complexity - O(n)
//Auxilary Space - O(n)




public static void findAll()
{
    //Your code here
    for(int i=1;i<1e6+1;i++){
        if(isValid(i)){
            mp.put(i,1);
        }
    }
}
public static boolean isValid(int n){
    while(n>0){
        int key=n%10;
        if(key==0 || key>=4){
            return false;
        }
        n/=10;
    }
    return true;
}
  
      

