class InvalidAmountException extends RuntimeException{
    public InvalidAmountException(String message){
        super(message);
    }
}
class user_uncheckedexception{
    double balance=5000;
    void withdraw(double amount){
        if(amount<=0){
            throw new InvalidAmountException("amount must be greater than 0")
        }
    }
}