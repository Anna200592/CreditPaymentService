public class CreditPaymentService {
    public int calculate(int amount, double percent, int time) {
        double t = time;
        double ps = percent / (100 * 12);
        double pp = Math.pow(1 + ps, -t);
        double factor1 = (int) amount * ps;
        double factor2 = 1 - pp;
        int index;
        index = (int) ((int) factor1 / factor2);
        return index;
    }
}
