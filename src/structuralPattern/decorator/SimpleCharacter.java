package structuralPattern.decorator;

public class SimpleCharacter implements Character {
    private String name;
    private int hitpoints;
    private int damage;
    private String weapon;

    public SimpleCharacter(String name, int hitpoints, int damage, String weapon) {
        this.name = name;
        this.hitpoints = hitpoints;
        this.damage = damage;
        this.weapon = weapon;
    }

    @Override
    public int getHitpoints() {
        return hitpoints;
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public String getWeaponInfo() {
        return weapon;
    }
}
