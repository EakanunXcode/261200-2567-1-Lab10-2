public interface Xpay {
    void setCreditCardNo(String creditCardNo);
    void setCustomerName(String customerName);
    void setCardExpMonth(String cardExpMonth);
    void setCardExpYear(String cardExpYear);
    void setCardCVVNo(short cardCVVNo);
    void setAmount(double amount);

    // เพิ่มเมธอด getter สำหรับ creditCardNo
    String getCreditCardNo();

    // เพิ่มเมธอด getter สำหรับ customerName
    String getCustomerName();

    // เพิ่มเมธอด getter สำหรับ cardExpMonth
    String getCardExpMonth();

    // เพิ่มเมธอด getter สำหรับ cardExpYear
    String getCardExpYear();

    // เพิ่มเมธอด getter สำหรับ cardCVVNo
    short getCardCVVNo();

    // เพิ่มเมธอด getter สำหรับ amount
    double getAmount();
}
