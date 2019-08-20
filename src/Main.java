import creationalPattern.abstractFactory.AbstractFactoryUsage;
import creationalPattern.builder.BuilderUsage;
import creationalPattern.factory.FactoryUsage;
import creationalPattern.prototype.PrototypeUsage;
import creationalPattern.singleton.SingletonUsage;
import structuralPattern.composite.CompositeUsage;
import structuralPattern.decorator.DecoratorUsage;

public class Main {
    public static void main(String[] args) {
        separator();
            SingletonUsage.main();
        separator();
            BuilderUsage.main();
        separator();
            FactoryUsage.main();
        separator();
            PrototypeUsage.main();
        separator();
            AbstractFactoryUsage.main();
        separator();
            DecoratorUsage.main();
        separator();
            CompositeUsage.main();
        separator();
    }

    private static void separator() {
        System.out.println(new String(new char[50]).replace("\0", "#"));
    }
}
