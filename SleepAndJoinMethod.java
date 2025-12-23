class JoinandSleepThread extends Thread{
    public void run(){
        try{
            for(int i=1;i<=5;i++){
                System.out.println("sleep count: "+i);
                Thread.sleep(2000);
            }
        }catch (InterruptedException e){
            System.out.println("interrupted");

        }
    }
}

public class SleepAndJoinMethod {
    public static void main(String[] args) throws InterruptedException{
        JoinandSleepThread sj1=new JoinandSleepThread();
        sj1.start();
        sj1.join(5000);
        for(int i =1;i<=5;i++){
            System.out.println("main thread: "+i);
        }
    }
}
