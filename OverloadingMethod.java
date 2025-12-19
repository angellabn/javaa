class RunOverload extends Thread{
    public void run(){
        System.out.println("running without parameter");
    }
    public void run(int i){
        System.out.println("running with parameter");
    }

}



public class OverloadingMethod {
    public static void main(String[] args) {
        RunOverload t1= new RunOverload();
        t1.start(); //it will go to defaul start method of jvm n run it which will direct it to run the run method of the program
        // t1.run();  //simply run run method
        // t1.run(10);

        System.out.println("running main method");
    }
}
