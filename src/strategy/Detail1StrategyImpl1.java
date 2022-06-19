package strategy;

public class Detail1StrategyImpl1 implements Detail1Strategy {
    @Override
    public int detail1(double input) {
        return (int)(Math.sqrt(input));
    }
}
