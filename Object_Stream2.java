import java.io.*;
class Student implements Serializable{
int roll;
String name;
Student(int roll,String name){
this.roll=roll;
this.name=name;
}
}
class Object_Stream2{
public static void main(String args[]){
try{
ObjectInputStream in=new ObjectInputStream(new FileInputStream("myfile.txt"));
Student s=(Student)in.readObject();
System.out.println(s.roll+" "+s.name);
in.close();
}catch(Exception e){System.out.println(e);}
}
}



