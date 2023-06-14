

//Time Complexity - O(n^2)
//Auxilary Space - o(1)



class Solution
{
    //Function to find the minimum indexed character.
    public static int minIndexChar(String str, String patt)
    {
        // Your code here
        int n=str.length();
        int m=patt.length();
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            for(int j=0;j<m;j++){
                if(ch==patt.charAt(j)){
                    return i;
                }
            }
        }
        return -1;
    }
}

_____________________________________________________________________________________________________________________________________________________________________________




//Time Complexity - O(n)
//Auxilary Space - O(n)




class Solution
{
    //Function to find the minimum indexed character.
    public static int minIndexChar(String str, String patt)
    {
        // Your code here
        int n=str.length();
        int m=patt.length();
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<m;i++){
            map.put(patt.charAt(i),map.getOrDefault(patt.charAt(i),0)+1);
        }
        for(int i=0;i<n;i++){
            if(map.containsKey(str.charAt(i))){
                return i;
            }
        }
        return -1;
    }
}

_____________________________________________________________________________________________________________________________________________________________________________



//Time Complexity - O(n)
//Auxilary Space - O(1)


class Solution
{
    //Function to find the minimum indexed character.
    static final int c=256;
    public static int minIndexChar(String str, String patt)
    {
        // Your code here
        int n=str.length();
        int m=patt.length();
        int[] arr=new int[c];
        for(int i=0;i<m;i++){
            arr[patt.charAt(i)]++;
        }
        for(int i=0;i<n;i++){
            if(arr[str.charAt(i)]>0){
                return i;
            }
        }
        return -1;
    }
}
