package hw6;

public class Lecture {

    public static int count;
    public String lecture;
    public int id = Course.id;


    public Lecture(String lecture, int id) {
        this.lecture = lecture;
        this.id = id;

        count++;
        id = count;

    }


}