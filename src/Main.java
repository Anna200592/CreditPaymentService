public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int index = service.calculate(1_000_000, 9.99, 36);
        System.out.println(" Сумма ежемесячного платежа " + index + " рублей");
    }
}
