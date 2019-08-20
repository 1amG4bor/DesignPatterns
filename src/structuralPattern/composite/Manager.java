package structuralPattern.composite;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Manager implements Employee {
    private String name;
    private List<Employee> team;
    Random r = new Random();

    public Manager(String name, Manager manager) {
        this.name = name;
        this.team = new ArrayList<>();
        if (null == manager) {
            System.out.println(name + " has hired as a manager.");
        } else {
            manager.addTeamMember(this);
            System.out.println(name + " has hired as a manager in the team of " + manager.getName());
        }
    }

    public void addTeamMember(Employee member) {
        team.add(member);
    }

    public void describeTeam() {
        StringBuilder list  = new StringBuilder();
        team.stream().forEach(i -> list.append("," + i.getName() + " "));
        list.deleteCharAt(0);
        System.out.println(name + ": My team consists of: " + list.toString());
        team.stream()
                .filter(member -> member instanceof Manager)
                .forEach(member -> ((Manager) member).describeTeam());
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void work(String task) {
        if (team.size() > 0) {
            int tag = r.nextInt(team.size());
            Employee subordinate = team.get(tag);
            System.out.println(name + ": Hey " + subordinate.getName() + ", here's a task for you!");
            subordinate.work(task);
        } else {
            System.out.println("Okay, I'll " + task);
            System.out.println();
        }
    }
}
