import java.io.*;
class Input_Stream{
public static void main(String args[]){
try{

FileInputStream fio= new FileInputStream("Third.txt");
int i=0;
while((i=fio.read())!=-1){
System.out.println((char)i);
}



fio.close();
}catch(Exception Ex)
{System.out.println(Ex);}
System.out.println("Done.....");
}
}

