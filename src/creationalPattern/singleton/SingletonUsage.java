package creationalPattern.singleton;

public class SingletonUsage {
    public static void main(String... args) {
        System.out.println("Singleton TEST!");
        Singleton mySingleton = Singleton.getInstance();
        Singleton mySingleton2 = Singleton.getInstance();

        System.out.print("Check the two instances: ");
        System.out.println(mySingleton.equals(mySingleton2) ? "'same instances'" : "'different instances'");
        System.out.println();
    }
}
