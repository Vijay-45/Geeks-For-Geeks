

//Time Complexity - O(n)
//Auxilary Space - O(n)


class Solution
{
    //Function to arrange all letters of a string in lexicographical 
    //order using Counting Sort.
    public static String countSort(String arr)
    {
        // code here
        int n=arr.length();
        int[] count=new int[26];
        Arrays.fill(count,0);
        for(int i=0;i<n;i++){
            count[arr.charAt(i)-'a']++;
        }
        String res="";
        for(int i=0;i<26;i++){
            while(count[i]>0){
                res+=(char)(i+'a');
                count[i]--;
            }
        }
        return res;
    }
}
