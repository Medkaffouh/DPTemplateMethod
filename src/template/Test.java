package template;

public class Test {
    public static void main(String[] args) {
        Template template=new TemplateImpl1();
        System.out.println(template.computeTempate(6,90));
        template=new TemplateImpl2();
        System.out.println(template.computeTempate(6,90));
    }
}
