public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double s = 1_000_000; //сумма кредита, руб.
        double sk = 1; //срок кредитования, лет
        double ps = 9.99; //процентная ставка годовая

        double ep = service.calculate(s, sk, ps); //ежемесячный платеж, руб.
        System.out.println("1 000 000 руб. на 1 год под 9,99%");
        System.out.println("Ежемесячный платеж " + ep + " руб.");

        System.out.println("1 000 000 руб. на 2 года под 9,99%");
        System.out.println(service.calculate(1_000_000, 2, 9.99) + " руб.");

        System.out.println("1 000 000 руб. на 3 года под 9,99%");
        System.out.println(service.calculate(1_000_000, 3, 9.99) + " руб.");
    }
}