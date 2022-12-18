package homework_3.Online_school;

public class FirstYearStudy {

    private final int ID = 1;

    public int teacher;
    public int student;
    public String lecture;
    public int homework;

    public FirstYearStudy() {
        this.teacher = 2;
        this.student = 9;
        this.lecture = "Java Programming";
        this.homework = 3;

        System.out.println("First Year Study:");
        System.out.println("Name of lecture - " + lecture);
        System.out.println("Number of Teachers " + teacher);
        System.out.println("Number of students " + student);
        System.out.println("Number of homework " + student);

    }
}