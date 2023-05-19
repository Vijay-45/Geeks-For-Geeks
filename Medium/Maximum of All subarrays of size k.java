

//Time Complexity - O(n*k)
//Auxilary Space - O(n)



class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        int mx=0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n-(k-1);i++){
            mx=arr[i];
            for(int j=i+1;j<i+k;j++){
                mx=Math.max(mx,arr[j]);
            }
            list.add(mx);
        }
        return list;
    }
}

_____________________________________________________________________________________________________________________________________________________________________________




//Time Complxity - O(n)
//Auxilary Space - O(k)


class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        
        Deque<Integer> q = new ArrayDeque<>();
        for(int i=0;i<n;i++){
            while((!q.isEmpty())&& q.peek()==i-k){
                q.poll();
            }
            
            while((!q.isEmpty()) && arr[q.peekLast()]<=arr[i]){
                q.pollLast();
            }
            q.offer(i);
            if(i>=k-1){
                list.add(arr[q.peek()]);
            }
        }
        return list;
    }
}
