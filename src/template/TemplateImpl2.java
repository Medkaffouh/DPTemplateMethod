package template;

public class TemplateImpl2 extends Template{
    @Override
    protected int detail1(double input) {
        return (int)(Math.atan(input));
    }

    @Override
    protected double detail2(double x, double y, int param) {
        double w=x*y*param;
        return w+param;
    }
}
