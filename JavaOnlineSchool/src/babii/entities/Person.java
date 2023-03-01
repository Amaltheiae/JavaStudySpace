package babii.entities;

import babii.hw11.MainHw11;

public class Person {

    public static int countPerson;
    private int id;
    private int courseId;
    private String name;
    private Role role;

    public Person(String name, int courseId, String role) {
        id = ++countPerson;
        this.name = name;
        this.courseId = courseId;
        this.role = Role.valueOf(role.toUpperCase());
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", courseId=" + courseId +
                ", name='" + name + '\'' +
                ", role=" + role +
                '}';
    }
    public void info(){
        System.out.println(role);
        System.out.println(name);
        MainHw11.showById(courseId);
    }
}
