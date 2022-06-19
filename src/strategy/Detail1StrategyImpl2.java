package strategy;

public class Detail1StrategyImpl2 implements Detail1Strategy {
    @Override
    public int detail1(double input) {
        return (int)(Math.atan(input));
    }
}
