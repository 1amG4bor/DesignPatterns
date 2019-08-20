package structuralPattern.decorator;

public class ArmoredCharacter implements Character {
    private Character armored;

    public ArmoredCharacter(Character user) {
        armored = user;
    }

    @Override
    public int getHitpoints() {
        return (int) (armored.getHitpoints() * 1.2);
    }

    @Override
    public int getDamage() {
        return armored.getDamage() + 15;
    }

    @Override
    public String getWeaponInfo() {
        return "sword";
    }
}
