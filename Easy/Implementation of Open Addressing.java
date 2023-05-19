





public class Main
{
	public static void main(String[] args) {
		MyHash hash = new MyHash(3);
		hash.Insert(5);
		hash.Insert(15);
		hash.Insert(12);
		hash.Erase(5);
		hash.display();
	}
}
class MyHash{
    int[] hash;
    int cap;
    int size;
    public MyHash(int c){
        cap=c;
        size=0;
        hash=new int[cap];
        for(int i=0;i<c;i++){
            hash[i]=-1;
        }
    }
    int hsh(int key){
        return key%cap;
    }
    boolean Insert(int key){
        
        if(size==cap){
            return false;
        }
        int i=hsh(key);
        while(hash[i]!=-1 && hash[i]!=key && hash[i]!=-2){
            i=(i+1)%cap;
        }
        if(hash[i]==key){
            return false;
        }
        if(hash[i]==-1){
            hash[i]=key;
            size++;
            return true;
        }
        return false;
    }
    void display(){
        for(int i=0;i<cap;i++){
            System.out.print(hash[i]+" ");
        }
    }
    boolean Search(int key){
        int i=hsh(key);
        int l=i;
        
        while(hash[i]!=key && hash[i]!=-1){
            i=(i+1)%cap;
            if(i==l){
                return false;
            }
        }
        if(hash[i]==key){
            return true;
        }
        return false;
    }
    boolean Erase(int key){
        int i=hsh(key);
        int l=i;
        while(hash[i]!=key && hash[i]!=-1){
            i=(i+1)%cap;
            if(i==l){
                return false;
            }
        }
        if(hash[i]==key){
            hash[i]=-2;
            return true;
        }
        return false;
    }
}
