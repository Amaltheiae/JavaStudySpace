package hw6;


import static hw6.Lecture.count;

public class Main {

    public static void main(String[] args){


        Lecture lectureOne = new Lecture("First", 1);
        Lecture lectureTwo = new Lecture("Second", 2);
        Lecture lectureThree = new Lecture("Third", 3);
        Lecture lectureFour = new Lecture("Fourth", 4);
        Lecture lectureFive = new Lecture("Fifth", 5);
        Lecture lectureSix = new Lecture("Sixth", 6);


        System.out.println("Student: " + lectureSix.id);
        
       System.out.println("Number of objects created :" + count);


    }


}
