class OverRiddingStart extends Thread{
    public void start(){
        super.start();
        System.out.println("start method is running");
    }
    public void run(){
        System.out.println("run method running");
    }
}

public class OverRiddingStartMethod {
    public static void main(String[] args) {
        OverRiddingStart t1=new OverRiddingStart();
    t1.start();
    // t1.run();
    System.out.println("main method running");
    }
    
     
}
