package strategy;

public class Detail2StrategyImpl2 implements Detail2Strategy {
    @Override
    public double detail2(double x, double y, int param) {
        double w=x*y/param;
        return w+param;
    }
}
