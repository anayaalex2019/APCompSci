public abstract class Account {

    protected int customer;
    protected double balance;

    Account() {



    }

    public void deposite(double amount) {
        balance += amount;
    }
    public void withdrawl(double amount) {
        balance -= amount;
    }
    public void checkBalance(){
        System.out.printf("Your balance is %d Dollars",balance);
    }



}