public class Example2{
public static void main(String args[]){

StringBuffer s = new StringBuffer("Hello ");
System.out.println("Initial String is: " +s);
System.out.println("After Appending world: " +s.append("world"));
System.out.println("After Inserting BCA: " +s.insert(6,"BCA "));
System.out.println("After Removing BCA:" +s.delete(6,9));
System.out.println("Replace world with Nepal:" +s.replace());
System.out.println("After Reversing: "+s.reverse());
}
}
