package creationalPattern.singleton;

public class SingletonUsage {
    public static void main(String... args) {
        System.out.println("Singleton TEST!\n");

        System.out.println("Create two instances...");
        Singleton mySingleton = Singleton.getInstance();
        Singleton mySingleton2 = Singleton.getInstance();

        System.out.print("Check the instances: ");
        System.out.println(mySingleton.equals(mySingleton2) ? "'same object'" : "'different objects'");
    }
}
