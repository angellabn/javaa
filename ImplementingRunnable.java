class MyRunnable implements Runnable{
    public void run(){
        for(int j=1;j<=5;j++){
            System.out.println("runnable child thread: "+j);
        }
    }
}


public class ImplementingRunnable {
    public static void main(String[] args) {
        MyRunnable obj=new MyRunnable();
        Thread t1=new Thread();
        t1.start();

        for(int i=1;i<=5;i++){
            System.out.println("main thread: "+i);
        }
    }
}
