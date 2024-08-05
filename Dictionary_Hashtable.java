import java.util.*;
public class Dictionary_Hashtable {
public  static void main(String args[]) {

//create a new hashtable
Hashtable<Integer, String> hash = new Hashtable<Integer, String>();
//put some elements
hash.put(1, "beer");
hash.put(2, "tea");
hash.put(5, "Coffee");
System.out.println(hash);
System.out.println("Getting value of key 5: "+hash.get(5));
//remove
hash.remove(2);
System.out.println(hash);
}
}
