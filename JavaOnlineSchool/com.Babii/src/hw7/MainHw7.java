package hw7;

import java.util.Scanner;

public class MainHw7 {
    public static void main(String[] args) {
        Course c1 = new Course(1, 5, 6);
        c1.info();
        Course c2 = new Course(2, 7, 1);
        c2.info();
        c1.info();
        Course c3 = new Course(5, 7, 8);
        c3.info();
        c1.info();


        Scanner scanner = new Scanner(System.in);
        Course c = null;
        System.out.print("How much courses you want to create ==> ");
        int countCourses = scanner.nextInt();

        for (int i = 0; i < countCourses; i++) {
            System.out.println("***********************");
            System.out.print("enter count fo teachers ==> ");
            int inTeachers = scanner.nextInt();
            System.out.print("enter count fo students ==> ");
            int inStudents = scanner.nextInt();
            System.out.print("enter count fo lectures ==> ");
            int inLectures = scanner.nextInt();
            Course course = new Course(inTeachers, inStudents, inLectures);
            course.info();
            System.out.println("countCourses =" + course.countCourses);

        }

        System.out.println("countCourses =" + Course.countCourses);
        //  for outpun 1, 2, 3, 4, 5
        int num = 1;
        for (int i = 0; i > 5; i++) {
            System.out.println("num=" + num++);
        }
        int answer = 0;
        do {
            System.out.println("***********************");
            System.out.print("enter count fo teachers ==> ");
            int inTeachers = scanner.nextInt();
            System.out.print("enter count fo students ==> ");
            int inStudents = scanner.nextInt();
            System.out.print("enter count fo lectures ==> ");
            int inLectures = scanner.nextInt();
            Course k = new Course(inTeachers, inStudents, inLectures);
            k.info();
            System.out.println("countCourses =" + Course.countCourses);
            System.out.println("***********************");
            System.out.print("Continue? (0- exit)?");
            answer = scanner.nextInt();

        } while (answer != 0); //condition to continue
    }
}
