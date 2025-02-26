public class XpayToPayDAdapter implements PayD {
    private Xpay xpay;

    public XpayToPayDAdapter(Xpay xpay) {
        this.xpay = xpay;
    }

    @Override
    public void processPayment(long creditCardNo, String customerName, int cardExpMonth, int cardExpYear, short cardCVVNo, double amount) {
        // แปลงข้อมูลจาก Xpay ไปเป็นรูปแบบของ PayD
        long cardNo = Long.parseLong(xpay.getCreditCardNo());
        int expMonth = Integer.parseInt(xpay.getCardExpMonth());
        int expYear = Integer.parseInt(xpay.getCardExpYear());
        // สมมติว่า PayD ประมวลผลการชำระเงินที่นี่ (ไม่มีการให้รายละเอียดของการประมวลผล)
        System.out.println("Processing payment for " + customerName);
        System.out.println("Credit Card No: " + cardNo);
        System.out.println("Expiration: " + expMonth + "/" + expYear);
        System.out.println("CVV: " + xpay.getCardCVVNo());
        System.out.println("Amount: " + xpay.getAmount());
    }
}
