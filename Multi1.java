class Multi {
 synchronized public void table(int n){
for (int i = 1; i <= 10; i++) {
System.out.println(n * i);
try {
Thread.sleep(10000);
}catch (Exception ex) {
}  
}
}
 
public static void main(String args[]) {
Multi obj =new Multi();
Thread t1 = new Thread() {
public void run() {
obj.table(5);
}
};
Thread t2 = new Thread() {
public void run() {
obj.table(100);
}
};
t1.start();
t2.start();
}
}
