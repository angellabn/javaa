public class exception {
    public static void main(String[] args) {
        try{
            System.out.println("before division");
            int a=10/0;
            System.out.println("after division");
        }catch(ArithmeticException e){
            System.out.println("cannot be divided by zero");
        }
        System.out.println("program executed");
    }
    
}
