abstract class A{
abstract void tiger();
abstract void lion();
}
class Q extends A{
void tiger(){
System.out.println("This is Tiger");
}

void lion(){
System.out.println("This is Lion");
}

public static void main(String args[]){
Q obj=new Q();
obj.tiger();
obj.lion();
}
}
