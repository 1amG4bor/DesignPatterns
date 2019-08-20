package structuralPattern.decorator;

public class DecoratorUsage {

    public static void main(String... args) {
        System.out.println("Decorator TEST!\n");

        System.out.println("Create a character!");
        Character user = new SimpleCharacter("User", 300, 15, "fist");
        System.out.println("\t- hitpoints: " + user.getHitpoints());
        System.out.println("\t- damage: " + user.getDamage());
        System.out.println("\t- weapon: " + user.getWeaponInfo());

        System.out.println("\nMake him armored!");
        Character armoredUser = new ArmoredCharacter(user);
        System.out.println("\t- hitpoints: " + armoredUser.getHitpoints());
        System.out.println("\t- damage: " + armoredUser.getDamage());
        System.out.println("\t- weapon: " + armoredUser.getWeaponInfo());
    }
}
