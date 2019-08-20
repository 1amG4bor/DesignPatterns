package creationalPattern.prototype;

import java.util.UUID;

public class Sheep implements Cloneable {
    private String name;
    private final String dnaCode;

    public Sheep(String name) {
        this.name = name;
        dnaCode = UUID.randomUUID().toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDnaCode() {
        return dnaCode;
    }

    public Sheep clone(String withName) {
        Sheep cloned = null;
        try {
            cloned = (Sheep) this.clone();
            System.out.println("Cloning process was succesful!");
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning process failed!");
            return null;
        }
        cloned.setName(withName);
        return cloned;
    }

    @Override
    public String toString() {
        return "Sheep:\n" +
                "\tname: '" + name + "'\n" +
                "\tdnaCode='" + dnaCode + "'";
    }
}
