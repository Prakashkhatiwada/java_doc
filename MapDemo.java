import java.util.*;
class MapDemo {
public static void main(String args[]) {
Map<Integer,String> obj =new HashMap<Integer,String>();
obj.put(1,"chor");
obj.put(2,"fata");
System.out.println("set 1: obj");
for(Map.Entry<Integer,String> e:obj.entrySet())
System.out.println(e.getKey()+":"+e.getValue());
}
}
