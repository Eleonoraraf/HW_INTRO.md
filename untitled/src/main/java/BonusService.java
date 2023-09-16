public class BonusService {
    public long calculate(long amount, boolean registered) {
        intpercent = registered ? 3 : 1;
        long bonus = amount * percent / 100;
        longlimit = 500;
        if (bonus > limit) {
            bonus = limit;
        }
        return bonus;
    }
}
