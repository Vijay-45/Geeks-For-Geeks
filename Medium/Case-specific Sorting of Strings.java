

//Time Complexity - O(nlogn)
//Auxilary Space - O(n)


class Solution
{
    //Function to perform case-specific sorting of strings.
    public static String caseSort(String s)
    {
        // Your code here
        int n=s.length();
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        int index=0,index2=0;
        for(int i=0;i<n;i++){
            char temp=s.charAt(i);
            if(Character.isLowerCase(temp)){
                sb1.append(temp);
            }
            else{
                sb2.append(temp);
            }
        }
        char[] arr1=sb1.toString().toCharArray();
        char[] arr2=sb2.toString().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        StringBuilder res=new StringBuilder();
        for(int i=0;i<n;i++){
            if(Character.isLowerCase(s.charAt(i))){
                res.append(arr1[index++]);
            }
            else{
                res.append(arr2[index2++]);
            }
        }
        return res.toString();
    }
}
