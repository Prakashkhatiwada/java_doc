import java.io.*;
class Output_Stream{
public static void main(String args[]){
try{

FileOutputStream fo= new FileOutputStream("Third.txt");
String s="Madhav is a bad gorail...";
byte b[]=s.getBytes();
fo.write(b);
fo.close();
}catch(Exception Ex)
{System.out.println(Ex);}
System.out.println("Done.....");
}
}

