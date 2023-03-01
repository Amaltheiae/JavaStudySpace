package babii.hw7.partB;

import java.util.Scanner;

public class MainB {

    public static void main(String[] args) {


        LecturesB lecture = new LecturesB(2);
        CourseB course = new CourseB(3, 4, 2);

        if (lecture.id <= 0) {
            System.out.println("We have no lectures");
        } else {
            System.out.println("please enter 1 for create First Course ");
            System.out.println("please enter 2 for create Second Course ");
            System.out.println("please enter 3 for create Third Course ");

            Scanner scanner = new Scanner(System.in);
            final int i = scanner.nextInt();


            switch (i) {
                case 1:
                    CourseB course1 = new CourseB(2, 4, 3);
                    System.out.println("All information of First Course:");
                    System.out.println("teachers " + course1.teacher);
                    System.out.println("students " + course1.student);
                    System.out.println("lectures " + course1.lecture);
                    break;
                case 2:
                    CourseB course2 = new CourseB(4, 8, 7);
                    System.out.println("All information of Second Course:");
                    System.out.println("teachers " + course2.teacher);
                    System.out.println("students " + course2.student);
                    System.out.println("lectures " + course2.lecture);
                    break;
                case 3:
                    CourseB course3 = new CourseB(3, 3, 5);
                    System.out.println("All information of Third Course:");
                    System.out.println("teachers " + course3.teacher);
                    System.out.println("students " + course3.student);
                    System.out.println("lectures " + course3.lecture);
                    break;
                default:
                    System.out.println("Incorrect input");
            }
        }


        System.out.println("please input number ");
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            final int numb1erFromScanner = scanner.nextInt();
            LecturesB lectureForScan = new LecturesB(1);
            System.out.println(lectureForScan);
        }
    }
}








