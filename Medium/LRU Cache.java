

//Time Complexity - O(1)
//Auxilary Space - O(1)






class LRUCache
{
    //Constructor for initializing the cache capacity with the given value.
    static HashMap<Integer,Node> map;
    static Node head,tail;
    static int capacity,count;
    
    LRUCache(int cap)
    {
        //code here
        this.capacity=cap;
        map=new HashMap<>();
        head=new Node(0,0);
        tail=new Node(0,0);
        head.next=tail;
        tail.prev=head;
        head.prev=null;
        tail.next=null;
        count=0;
    }

    //Function to return value corresponding to the key.
    public static int get(int key)
    {
        // your code here
        if(map.get(key)!=null){
            Node node=map.get(key);
            int res=node.value;
            deleteNode(node);
            addToHead(node);
            
            return res;
        }
        return -1;
    }

    //Function for storing key-value pair.
    public static void set(int key, int value)
    {
        // your code here
      //If the key present in the map It is Hit
        if(map.get(key)!=null){
            Node node=map.get(key);
          //As it is an Hit then it will be add as recent and make the first One removing from the current position
            node.value=value;
            deleteNode(node);
            addToHead(node);
        }
      //If it is not present then it is miss so it is the recent One
        else{
            Node node=new Node(key,value);
            map.put(key,node);
          //If it is less than the capacity
            if(count<capacity){
                count++;
                addToHead(node);
            }
              //If capacity Exceeds then the last node will be removed from it
            else{
                map.remove(tail.prev.key);
                deleteNode(tail.prev);
                addToHead(node);
            }
        }
    }
    public static  void deleteNode(Node node){
        node.next.prev=node.prev;
        node.prev.next=node.next;
    }
    public static  void addToHead(Node node){
        node.next=head.next;
        node.next.prev=node;
        head.next=node;
        node.prev=head;
    }
}
class Node{
    int key;
    int value;
    Node prev,next;
    Node(int key,int value){
        this.key=key;
        this.value=value;
    }
}
