public class exception3 {
    public static void main(String[] args) {
        try{
            int a=10/2;
            System.out.println("value of s:"+a);

            int[] arr=new int[2];
            arr[1]=20;
            System.out.println("val of arr:"+arr[1]);

            String s="Avenger";
            System.out.println("length of sting:"+ s.length());

        }catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("exception occurred:"+e);
        }
        System.out.println("program continues");
    }
}
