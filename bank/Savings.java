public class Savings extends Account{

    Savings(int newCustomer, double newBalance) {
        int customer = newCustomer;
        double balance = newBalance;
        System.out.printf("Account %d created.", customer);
    }

}