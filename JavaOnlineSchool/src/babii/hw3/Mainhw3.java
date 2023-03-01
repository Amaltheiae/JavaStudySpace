package babii.hw3;


import babii.hw3.onlineschool.Course;
import babii.hw3.onlineschool.Lecture;

public class Mainhw3 {


    public static void main(String[] args) {

//        FirstYearStudy firstYearStudy = new FirstYearStudy();
//        SecondYearStudy secondYearStudy = new SecondYearStudy();
//        ThirdYearStudy thirdYearStudy = new ThirdYearStudy();
        Lecture lectureOne = new Lecture("Основи Java");
        Lecture lectureTwo = new Lecture("Java data types");
        Lecture lectureNumberThree = new Lecture("Console outpute");
        System.out.println(lectureOne);
        System.out.println(lectureTwo);
        System.out.println(lectureNumberThree);
        System.out.println(lectureTwo.toString());
        System.out.println(Lecture.getNumLec());

        Lecture[] lectures = new Lecture[5];
        lectures[0] = lectureOne;
        lectures[1] = lectureTwo;
        lectures[2]= lectureNumberThree;
        lectures[3]= lectureTwo;
        lectures[4] = new Lecture("Lection for array");
        for (int i = 0; i < lectures.length; i++){
            System.out.println(lectures[i]);
        }
        lectureTwo.setTopic("New lection");
//        for (int i = 0; i < lectures.length; i++){
//            System.out.println(lectures[i]);
//        }
        getAll(lectures);

        Course course = new Course(22, "Java study", lectures);
        System.out.println(course);

        System.out.println("\nвиводжу лекції через лекції з курсу");
        getAll(course.getLectures());

        System.out.println("test");
        Lecture[] lectures1 = new Lecture[3];
        lectures1[0]= new Lecture("Hukmjnhbgfv");
        lectures1[1]= new Lecture("jnhynbtgv");
        lectures1[2]= new Lecture("x45t");

        Course c2 = new Course(22, "test", lectures1);
        c2.getAllLections();

        System.out.println("Program is over");
    }
    public static void getAll(Lecture[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}