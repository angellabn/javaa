import java.util.Scanner;

public class ATMApp{
    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);

        String correctAccountNumber = "12345678";
        int correctPin = 1234;

        double balance=5000;
        int choice;

        System.out.println("----Welcome to ATM App!-----");

        
        // ✅ Step 2: Ask user for account & PIN
        System.out.print("Enter your account number: ");
        String enteredAccount = scanner.next();

        System.out.print("Enter your PIN: ");
        int enteredPin = scanner.nextInt();

        // ✅ Step 3: Validate
        if (!enteredAccount.equals(correctAccountNumber) || enteredPin != correctPin) {
            System.out.println("Invalid account number or PIN. Access denied.");
            scanner.close();
            return; // stop the program here
        }

        System.out.println("Login successful. Welcome!");

        while (true) {

        
        System.out.println("1. check balance");
        System.out.println("2. withdraw");
        System.out.println("3. deposit");
        System.out.println("4. exit");

        System.out.println("select number between (1-4)");

        choice =scanner.nextInt();

        if(choice==1){
            System.out.println("the current balance is "+balance);
        }
        else if (choice==2){
            System.out.println("you selected to withdraw, Enter amount");
            Double wdamount= scanner.nextDouble();

            if(balance<wdamount){
                System.out.println("withdrawl not possible since balance is insufficient");
            }
            else{
                balance=balance-wdamount;
                System.out.println("withdrawl amount"+ wdamount);
                System.out.println("current balance"+ balance);
            }
        }
        else if(choice==3){
            System.out.println("you selected to deposit, Enter deposit amount");
            Double amount= scanner.nextDouble();

            if(amount<=0){
                System.out.println("Minimum amount should be atleast 50");
            }
            else{
                balance= balance+amount;
                System.out.println("amount added "+amount);
                System.out.println("current balance"+balance);
            }
        }
        else if(choice==4){
            System.out.println("you selected to exit");
            break;
        }
        else {
            System.out.println("invalid choice");
        }
    }
        scanner.close();
    }
}