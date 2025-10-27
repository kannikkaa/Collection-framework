package multithreading;
class Thread1 extends Thread {
    Thread1(String name) {
        super(name);
    }

    public void run() {

            System.out.println("what up " + getName());
    }
}
public class ThreadPriorities {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1("arun has max priority");
        Thread1 t2 = new Thread1("barun");
        Thread1 t3 = new Thread1("carun");
        Thread1 t4 = new Thread1("darun has most priority");
        Thread1 t5 = new Thread1("earun");
        t1.setPriority(Thread.MAX_PRIORITY);// it will not start unless u call the start()
        t2.start();
        t3.start();
        t4.start();
       t4.setPriority(Thread.MAX_PRIORITY);
        t5.start();

    }
}
