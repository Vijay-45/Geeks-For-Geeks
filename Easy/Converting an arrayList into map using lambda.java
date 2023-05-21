




import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    List < ListItems > list = new ArrayList <> ();
    list.add (new ListItems (1, "Hello"));
    list.add (new ListItems (2, "Yeahhh"));
    list.add (new ListItems (3, "oooooo!!"));
    list.add (new ListItems (4, "yrrrrr!!"));
    
    
    Map<Integer,String> map = new HashMap<>();
    
    list.forEach((n) ->{
        map.put(n.getValue(),n.getKey());
    });
    
    
    System.out.println(map);

  }
}
class ListItems
{
  private int value;
  private String key;
  public ListItems (Integer id, String name)
  {
    this.value = id;
    this.key = name;
  }
  public int getValue ()
  {
    return value;
  }
  public String getKey ()
  {
    return key;
  }
}
