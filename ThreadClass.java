class MyThread extends Thread{
    public void run(){
      for(int i=1;i<5;i++){
            System.out.println("MyThread thread "+i);
        }  
    }
}




public class ThreadClass {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        t1.start();
        // t1.run();  //runs in sequence

        for(int i=1;i<5;i++){
            System.out.println("main thread "+i);
        }
    }
    
}
