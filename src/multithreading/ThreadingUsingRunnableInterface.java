package multithreading;
class MyThreadRunnable1 implements Runnable{
    @Override//must override
    public void run() {
        System.out.println("MyThreadRunnable1 is executing");
    }
}
class MyThreadRunnable2 implements Runnable {
@Override
    public void run(){
    System.out.println("MyThreadRunnable2 is executing");
}
}
    public class ThreadingUsingRunnableInterface {
        public static void main(String[] args) {
      //You can't call .start() on bullet1, because it's not a Thread,
            // it's just a Runnable object.You wrap it into a Thread like this:
            MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);
            gun1.start();
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);
        gun2.start();
        //t1.start(); it will show compile time error

    }
}
