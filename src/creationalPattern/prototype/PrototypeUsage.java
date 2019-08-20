package creationalPattern.prototype;

public class PrototypeUsage {
    public static void main(String... args) {
        System.out.println("Prototype TEST!");
        Sheep originalSheep = new Sheep("Jolly");
        System.out.println("\nCloning process in progress...");
        System.out.println(String.format("Original sheep's name: %s", originalSheep.getName()));
        Sheep clonedSheep = originalSheep.clone("Dolly");

        System.out.println("DNA-codes of two sheep: " + originalSheep.getDnaCode() + " & " + clonedSheep.getDnaCode());
        System.out.println("Sheep details:");
        System.out.println(originalSheep.toString());
        System.out.println(clonedSheep.toString());
    }
}
