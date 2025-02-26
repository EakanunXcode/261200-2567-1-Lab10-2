public class Main {
    public static void main(String[] args) {
        // สร้างวัตถุ Xpay และตั้งค่ารายละเอียด
        Xpay xpay = new XpayImpl();
        xpay.setCreditCardNo("666999669969");
        xpay.setCustomerName("Eakanun Gunthajan");
        xpay.setCardExpMonth("04");
        xpay.setCardExpYear("26");
        xpay.setCardCVVNo((short) 555);
        xpay.setAmount(50000.0);

        // สร้างวัตถุ PayD ผ่าน Adapter
        PayD payD = new XpayToPayDAdapter(xpay);
        // ประมวลผลการชำระเงิน
        payD.processPayment(Long.parseLong(xpay.getCreditCardNo()), xpay.getCustomerName(),
                Integer.parseInt(xpay.getCardExpMonth()), Integer.parseInt(xpay.getCardExpYear()),
                xpay.getCardCVVNo(), xpay.getAmount());
    }
}
