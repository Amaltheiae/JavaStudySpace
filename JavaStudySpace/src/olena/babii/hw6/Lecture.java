package olena.babii.hw6;

public class Lecture {

    public static int count;
    public String lecture;
    public int id;


    public Lecture(String lecture) {
        this.lecture = lecture;
        count++;
        this.id = count;

    }


}