public interface PayD {
    void processPayment(long creditCardNo, String customerName, int cardExpMonth, int cardExpYear, short cardCVVNo, double amount);
}
