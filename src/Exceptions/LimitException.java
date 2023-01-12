package Exceptions;

public class LimitException extends Exception{
    private double RemainingAmount;

    public LimitException(String message, double amount) {
        super(message);
        this.RemainingAmount = RemainingAmount;
    }

    public double getRemainingAmount() {
        return RemainingAmount;
    }
}
