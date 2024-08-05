import java.io.*;
class Student implements Serializable{
int roll;
String name;
Student(int roll,String name){
this.roll=roll;
this.name=name;
}
}
class Object_Stream{
public static void main(String args[]){
try{
Student s1 =new Student(1,"Bob");
FileOutputStream fout=new FileOutputStream("my file.txt");
ObjectOutputStream out=new ObjectOutputStream(fout);
out.writeObject(s1);
out.flush();
out.close();
System.out.println("success bro ");
}catch(Exception e){System.out.println(e);}
}
}

