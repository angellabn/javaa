//unchecked

public class throww {
    public static void main(String[] args) {
        double amount=3000;
        double balance=5000;

        if(amount>balance){
            throw new IllegalArgumentException("insufficient balance");
        }

        balance-=amount;
        System.out.println("withdrawl successful. remaining balance "+ balance);
    }
}
