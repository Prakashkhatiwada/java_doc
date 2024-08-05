import java.util.Scanner;
class demo{
public static void main(String args[]){
int i,n,fact=1;
System.out.println("Enter any number: ");
Scanner sc=new Scanner (System.in);
n=sc.nextInt();
for(i=1;i<n;i++){
fact = fact*i;
}
System.out.println("factorial" + fact);
}
}


