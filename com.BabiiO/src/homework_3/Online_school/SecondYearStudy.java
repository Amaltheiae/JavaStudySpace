package homework_3.Online_school;

public class SecondYearStudy {

    private final int ID = 1;

    public int teacher;
    public int student;
    public String lecture;
    public int homework;

    public SecondYearStudy() {
        this.teacher = 1;
        this.student = 11;
        this.lecture = "Python Programming";
        this.homework = 4;

        System.out.println("Second Year Study:");
        System.out.println("Name of lecture - " + lecture);
        System.out.println("Number of Teachers " + teacher);
        System.out.println("Number of students " + student);
        System.out.println("Number of homework " + student);


    }
}
