import creationalPattern.builder.BuilderUsage;
import creationalPattern.factory.FactoryUsage;
import creationalPattern.prototype.PrototypeUsage;
import creationalPattern.singleton.SingletonUsage;

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
    }

    private static void separator() {
        System.out.println(new String(new char[50]).replace("\0", "#"));
    }
}
