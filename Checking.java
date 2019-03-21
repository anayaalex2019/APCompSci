public class Checking extends Account{

    Checking(int newCustomer, double newBalance) {
        int customer = newCustomer;
        double balance = newBalance;
        System.out.printf("Account %d created.", customer);
    }

}