/* should: accept amount of starting balance
        subtract amount of withdrawal
        add amount of deposit

        monthly interest rate = (annual interest rate / 12)
        to add monthly interest rate to balance = (monthly interest rate * balance) and add to result of balance

        ask for: 
             annual interest rate
             starting balance
             number of months

         loop should happen once per month:
             ask user for amount deposited that month -> add to balance
             ask user for amount withdrawn that month -> subtract from balance
         
         use class method to calculate monthly interest
         
         after last iteration, sout ending balance, total deposits, total withdraws, and total interest earned */

package java_one;
import java.util.*;

public class SavingsAccount {

    double balance, amount, annualInterestRate;
    int months;


    public static void main(String[] args){


        SavingsAccount account = new SavingsAccount(); // var name for object, now we can start using account.(....)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input starting balance: ");
        account.balance = scanner.nextDouble(); // put starting balance into account

        System.out.println("Input your annual interest rate: ");
        double annualInterestRate = scanner.nextDouble();

        System.out.println("How many months will you be saving?");
        int months = scanner.nextInt();

        for (int i = 0; i < months; i++){
            
            System.out.println("Enter amount deposited this month: ");
            double depositedAmount = scanner.nextDouble();
            account.deposit(depositedAmount);

            System.out.println("Account Balance: " + account.balance);


            System.out.println("Enter amount withdrawn this month: ");
            double withdrawnAmount = scanner.nextDouble();
            account.withdrawal(withdrawnAmount);

            System.out.println("Account Balance: " + account.balance);

            account.addMonthlyInterest(annualInterestRate);
            System.out.println("Current Balance for month " + (i + 1) + ": " + account.balance); // i + 1 bc loop starts at 0


        }

        scanner.close();

    }

    public void deposit(double amount){
        if (amount <= 0) {
            System.err.println("Cannot deposit a negative amount. Enter a different amount.");
        } else {
            this.balance += amount;
            System.out.println(amount + " has been deposited");
        }
    }
    
    public void withdrawal(double amount){
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println(amount + " has been withdrawn");
        } else {
            System.err.println("Transaction cancelled due to insuffecient funds.");
        }
    }

    public double addMonthlyInterest(double annualInterestRate){ // calculates interest AND adds to balance
        double monthlyInterest = this.balance * (annualInterestRate / 12);
        this.balance += monthlyInterest;
        return this.balance;
    }
}
