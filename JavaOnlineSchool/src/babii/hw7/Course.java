package babii.hw7;

public class Course {

    public static int countCourses;
    public int id;
    public int teacher;
    public int student;
    public int lecture;

    public Course(int teacher, int student, int lecture) {
        id = countCourses++;
        this.teacher = teacher;
        this.student = student;
        this.lecture = lecture;
    }

    public void info() {
        System.out.println("All information about Course " + id + ":");
        System.out.println("teachers " + teacher);
        System.out.println("students " + student);
        System.out.println("lectures " + lecture);
    }
}
