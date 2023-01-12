package Main;

import Bank.BankAccount;
import Exceptions.LimitException;

public class Main {
    public static void main(String[] args) throws LimitException {
        BankAccount account = new BankAccount();
        account.deposit(20000);

        while (true) {
            try {
                account.withDraw(6000);
            } catch (LimitException e) {
                System.out.println("Достигнут лимит вывода средств. У вас осталось "
                        + e.getRemainingAmount() + " на счете.");
                account.withDraw(e.getRemainingAmount());
                break;
            }
        }
    }
}