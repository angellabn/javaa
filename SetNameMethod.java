class SetNameThread extends Thread{
    public void run(){
        System.out.println("inside run method"+ Thread.currentThread().getName());
    }
}


public class SetNameMethod {
    public static void main(String[] args) {
        System.out.println("thread name b4 change: "+Thread.currentThread().getName());
        Thread.currentThread().setName("cookie");
        System.out.println("thread name after edit: "+Thread.currentThread().getName());

        SetNameThread t1=new SetNameThread();
        t1.setName("wild");
        SetNameThread t2=new SetNameThread();
        t2.setName("flower");

        t1.setName("hello t1");
        t1.setName("hello t2");

        t1.start();
        t2.start();
    }
}
