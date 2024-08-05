import java.util.LinkedList;
class Example{
public static void main(String args[]) {
LinkedList<String>language=new LinkedList<String>();
language.add("Bingo");
language.add("C#");
language.add("Python");
language.add("C");
language.add("C+");
language.add("Java");
language.add("JavaScript");
language.add("Cobol");
language.add("Forton");
language.add("Dijango");
language.add("C++");
language.add("MongoDB");
language.add("Peral");
language.add(".Net");

System.out.println("LinkedList:"+language);
language.set(3,"DSA");
System.out.println("Updated LinkedList:"+language);
String str = language.remove(4);
System.out.println("Removed Element:" +str);
}
}

