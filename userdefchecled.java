
public class userdefchecled {
    class InsufficentBalanceException extends exception{
        public InsufficentBalanceException(String masseage){
            super(message);
        }
    }
}
class user_checkedexception{
    double balance=5000;
    void withdraw(double amount)throws
    InsufficentBalanceException{
        if (amount>balance){
            throw new InsufficentBalanceException
            ("insufficient balance in acc");
        }
        balance-=amount;
        System.out.println("withdrawl successful");
    }
    public static void main(String[] args) {
        user_checkedexception amount= new user_checkedexception();
        try{
            amount.withdraw(7000);

        }catch(InsufficentBalanceException e){
            System.out.println("exception caught"+e.getMessage());

        }
    }
}
