

//Time Complexity - O(n*m^2)
//Auxilary Space - O(m)





class Solution{
    String longestCommonPrefix(String arr[], int n){
        // code here
        String reqst=arr[0];
        for(int i=1;i<n;i++){
            if(reqst.length()>arr[i].length()){
                reqst=arr[i];
            }
        }
        int m=reqst.length();
        while(m>0){
            String temp=reqst.substring(0,m);
            int count=0;
            for(int i=0;i<n;i++){
                if(temp.equals(arr[i].substring(0,m))){
                    count++;
                }
            }
            if(count==n){
                return temp;
            }
            m--;
        }
        return "-1";
    }
}



______________________________________________________________________________________________________________________________________________________________________________



//Time Complexity - O(n*m*logn)
//Auxilary Space  - O(m)


class Solution {
    public String longestCommonPrefix(String[] arr) {
        int n=arr.length;
        int i=0,j=0;
        String res="";
        Arrays.sort(arr);
        while(i<arr[0].length() && j<arr[n-1].length()){
            if(arr[0].charAt(i)!=arr[n-1].charAt(j)){
                break;
            }
            res+=arr[0].charAt(i);
            i++;j++;
        }
        return res;
    }
}
