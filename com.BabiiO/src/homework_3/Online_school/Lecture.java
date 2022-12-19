package homework_3.Online_school;

public class Lecture {
    private final int ID = 1;

    public int teacher;
    public int student;

    public Lecture(){

        this.teacher = 2;
        this.student = 4;

        System.out.println("Study lecture:");

        System.out.println("Number of Teachers " + teacher);
        System.out.println("Number of students " + student);

    }

}
