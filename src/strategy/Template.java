package strategy;

public class Template {
    private Detail1Strategy detail1Strategy;
    private Detail2Strategy detail2Strategy;
    public double computeTempate(double x, double y){
        double data=x*y;
        int param=detail1Strategy.detail1(data);
        double somme=y;
        for (int i = 0; i < param; i++) {
            double value=detail2Strategy.detail2(x,y,param);
            somme+=value;
        }
        return somme;
    }

    public void setDetail1Strategy(Detail1Strategy detail1Strategy) {
        this.detail1Strategy = detail1Strategy;
    }

    public void setDetail2Strategy(Detail2Strategy detail2Strategy) {
        this.detail2Strategy = detail2Strategy;
    }
}
