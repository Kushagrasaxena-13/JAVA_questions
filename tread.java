public class Main {

public static void main(String[] args) {
Even e= new Even();
Thread t = new Thread(e);
t.start();
Odd o= new Odd();
Thread t2 = new Thread(o);
t2.start();
}
}

class Odd implements Runnable{
public void run(){
for(int i=1;i<=20;i++){
if(i%2 == 1)
System.out.println(i);
}
}
}

class Even implements Runnable{
public void run(){
for(int i=1;i<=20;i++){
if(i%2 == 0)
System.out.println(i);
}
}
}
