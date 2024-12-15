public class CreditPaymentService {
    public int calculate(double s, double sk, double ps) {
        double kp = sk * 12; //количество платежей, шт.
        double pm = ps / 12 / 100; //процентная ставка месячная
        double x = Math.pow(1 + pm, kp);
        double k = (pm * x) / (x - 1);


        return (int) (s * k);

    }

}