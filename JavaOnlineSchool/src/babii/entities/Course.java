package babii.entities;

public class Course {

    private static int countCourses;
    private int id;
    private String name;
    private int teacher;
    private int student;
    private int lecture;

    public Course(String name, int teacher, int student, int lecture) {
        id = ++countCourses;
        this.name = name;
        this.teacher = teacher;
        this.student = student;
        this.lecture = lecture;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void info() {
        System.out.println("All information about Course " + id + ":");
        System.out.println("name: " + name);
        System.out.println("teachers " + teacher);
        System.out.println("students " + student);
        System.out.println("lectures " + lecture);
    }
}
