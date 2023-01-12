package Bank;

import Exceptions.LimitException;

public class BankAccount {
    private double amount;
    public BankAccount() {
        this.amount = 0;
    }

    public double getAmount() {
        return amount;
    }
    public void deposit(double sum){
        this.amount += sum;
    }

    public void withDraw(double sum) throws LimitException {
        if (sum > this.amount) {
            throw new LimitException("У вас не достаточно средств!", this.amount);
        }
        this.amount -= sum;
    }
}
