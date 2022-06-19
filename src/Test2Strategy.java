import strategy.*;

public class Test2Strategy {
    public static void main(String[] args) {
        Template template=new Template();
        template.setDetail1Strategy(new Detail1StrategyImpl1());
        template.setDetail2Strategy(new Detail2StrategyImpl1());
        System.out.println(template.computeTempate(6,90));
        template.setDetail1Strategy(new Detail1StrategyImpl2());
        template.setDetail2Strategy(new Detail2StrategyImpl2());
        System.out.println(template.computeTempate(6,90));
        template.setDetail1Strategy(new Detail1StrategyImpl1());
        template.setDetail2Strategy(new Detail2StrategyImpl2());
        System.out.println(template.computeTempate(6,90));
    }
}
