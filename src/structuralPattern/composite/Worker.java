package structuralPattern.composite;

public class Worker implements Employee {
    private String name;

    public Worker(String name, Manager manager) {
        this.name = name;
        manager.addTeamMember(this);
        System.out.println(name + " has hired as a worker in the team of " + manager.getName());
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void work(String task) {
        System.out.println(name + ": Okay boss, I'll " + task);
        System.out.println();
    }
}
