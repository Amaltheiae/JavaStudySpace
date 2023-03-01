package babii.hw3.onlineschool;

public class ThirdYearStudy {
    private final int ID = 1;

    public int teacher;
    public int student;
    public String lecture;
    public int homework;

    public ThirdYearStudy() {
        this.teacher = 1;
        this.student = 7;
        this.lecture = "Programming courses";
        this.homework = 3;

        System.out.println("Third Year Study:");
        System.out.println("Name of lecture - " + lecture);
        System.out.println("Number of Teachers " + teacher);
        System.out.println("Number of students " + student);
        System.out.println("Number of homework " + homework);

    }
}
