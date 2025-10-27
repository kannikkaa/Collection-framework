package multithreading;
class MyThreadP extends Thread1{
    MyThreadP(String name){
       super(name);
    }
    public  void run() {
        int i=0;
        while (i<100000) {
            System.out.println("hello " + getName());
            i++;
        }
    }
}
public class ThreadMethods {
    public static void main(String[] args) {
        MyThreadP t1 = new MyThreadP("kanika1");
        MyThreadP t2 = new MyThreadP("kanika2");
        MyThreadP t3 = new MyThreadP("kanika3");
        MyThreadP t4 = new MyThreadP("kanika4");
        MyThreadP t5 = new MyThreadP("kanika5");
        MyThreadP t6 = new MyThreadP("kanika6");

        t1.start();
        try {
            t1.join();//waiting for t1 to finish then i can start t2
        }
        catch(Exception e){
            System.out.println(e);
        }
        t2.start();
       t3.interrupt();//Requests thread to stop; sets interrupt flag
       t3.start();
       t4.checkAccess();
        t4.start();
        t4.checkAccess();//Checks access permission, throws exception if not allowed
        //t5.setState(Thread.MAX_PRIORITY);
        t6.start();
        t6.isAlive();//Returns true if thread started and not terminated
    }
}
