package multithreading;
class MyThread extends Thread {
    @Override
    public void run() {//should override but not must
        int i = 0;
        while (i < 40000) {
            System.out.println("jumping");
            i++;
        }
    }
}
class MyThreadSecond extends Thread{
    public void run(){
        int i=0;
        while(i<40000){
            System.out.println("cooking");
            i++;
        }
    }


}
public class ThreadingUsingThreadClass{
    public static void main(String[] args) {
MyThread t1 = new MyThread();
MyThreadSecond t2 = new MyThreadSecond();
t1.start();//start() calls internally run()
t2.start();

    }
}
