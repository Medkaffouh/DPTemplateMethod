package strategy;

public class Detail2StrategyImpl1 implements Detail2Strategy {
    @Override
    public double detail2(double x, double y, int param) {
        double w=x/y;
        return w*param;
    }
}
