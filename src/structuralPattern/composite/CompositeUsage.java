package structuralPattern.composite;

public class CompositeUsage {
    public static void main(String... args) {
        System.out.println("Composite TEST!\n");

        Employee boss = new Manager("The Boss", null);
        System.out.println("There is a boss, called 'The Boss'...");
        System.out.println("...and his employees!");

        Employee jack = new Worker("Jack", (Manager) boss);
        Employee john = new Manager("John", (Manager) boss);
        Employee sue = new Manager("Sue", (Manager) boss);
        System.out.println();
        Employee peter = new Manager("Peter", (Manager) john);
        Employee bob = new Worker("Bob", (Manager) peter);
        System.out.println();
        Employee nick = new Worker("Nick", (Manager) sue);
        Employee melanie = new Worker("Melanie", (Manager) sue);
        System.out.println("-----");
        System.out.println("\tTeam structure: ");
        ((Manager) boss).describeTeam();
        System.out.println("-----");
        System.out.println("\tTask management: ");
        boss.work("'do the cleaning'");
        boss.work("'sending the emails'");
        boss.work("'write letters for customers'");
        boss.work("'go to the bank'");
        boss.work("'bring some food'");
        boss.work("'clean the backyard'");
        boss.work("'bring some a coffee'");
    }
}
