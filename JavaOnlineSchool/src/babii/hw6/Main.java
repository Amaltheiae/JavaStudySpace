package babii.hw6;


public class Main {

    public static void main(String[] args) {


        Lecture lectureOne = new Lecture("First");
        Lecture lectureTwo = new Lecture("Second");
        Lecture lectureThree = new Lecture("Third");
        Lecture lectureFour = new Lecture("Fourth");
        Lecture lectureFive = new Lecture("Fifth");
        Lecture lectureSix = new Lecture("Sixth");


        System.out.println("Student: " + lectureSix.id);
        System.out.println("Number of objects created :" + Lecture.count);

    }


}
