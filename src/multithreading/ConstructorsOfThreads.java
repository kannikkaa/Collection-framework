package multithreading;
class MyThread1 extends Thread {
    MyThread1(String name) {//making constructor, using the constructor that is in built in  thread class
        super(name);//passes the thread name to the builtin thread class constructor
    }
    public void run() {
            System.out.println("thread(0): " + Thread.currentThread().getName());
    }
}
class MyThread2 extends Thread{
    MyThread2(String name){
        super(name);
    }
    public void run(){
        System.out.println("thread(1): "+Thread.currentThread().getName());
    }
}
class MyThread3 extends Thread {
    MyThread3(String name) {
        super(name);
    }

    public void run() {

        System.out.println("thread(2): " + Thread.currentThread().getName());
    }
}

public class ConstructorsOfThreads {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread: " + Thread.currentThread().getName());//getting main thread name, runs main()
       MyThread1 t1 = new MyThread1("kanika");// t1 is just an object — it's not the current thread until it starts running.
       MyThread2 t2 = new MyThread2("mayank");//here t2 is another thread that u created(named mayank),
        MyThread3 t3 = new MyThread3("suresh");
        System.out.println("state of thread t1 when i have just created it and not called it yet: "+t1.getState());
       t1.start();//t1 is a thread object. Once t1.start() is called, it starts a new thread, and that thread becomes the currentThread() inside run()
       t2.start();
           Thread.sleep(10);//makes main thread sleep give other threads time to run

       t3.start();
        System.out.println("id of thread(0): "+t1.getId()+", name: "+t1.getName()+", state: "+t1.getState()+", priority: "+t1.getPriority());
        System.out.println("id of thread(1): "+t2.getId()+", name: "+t2.getName()+", state: "+t2.getState()+", priority: "+t2.getPriority());
        System.out.println("id of thread(2): "+t3.getId()+", name: "+t3.getName()+", state: "+t3.getState()+", priority: "+t3.getPriority());
    }
}
//u cant create main thread(already a object in built-in thread class, created by JVM)
