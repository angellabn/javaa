public class exception2 {
    public static void main(String[] args) {
        try{
            int a=10/2;
            System.out.println("value of a:"+a);

            int[] arr=new int[2];
            arr[1]=10;
            System.out.println("value in array:"+ arr[1]);

            String s="Avenger";
            // String s=null;
            System.out.println("length of string:"+s.length());

        }catch(ArithmeticException e){
            System.out.println("arithermatic error");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("error in array");
        }catch(NullPointerException e){
            System.out.println("cannot find length of string");
        }
    }
}
