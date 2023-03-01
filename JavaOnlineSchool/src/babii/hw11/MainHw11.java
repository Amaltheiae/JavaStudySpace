package babii.hw11;

import babii.entities.Course;
import babii.entities.Lecture;
import babii.entities.Person;

import java.util.Scanner;

public class MainHw11 {
    private static Course[] javaOnlineSchool = new Course[]{new Course("Java1", 1, 10, 15),
            new Course("Java2", 1, 10, 15),
            new Course("Java3", 1, 10, 15)};
    public static Person[] personList;

    public static void showById(int id) {
        for (int i = 0; i < javaOnlineSchool.length; i++) {
            if (id == javaOnlineSchool[i].getId()) {
                javaOnlineSchool[i].info();
                return;
            }
        }
        System.out.println("Course with id = " + id + " is absent");
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int countPerson = 3;
        personList = new Person[countPerson];
        for (int i = 0; i < personList.length; i++) {
            System.out.println("Input name: ");
            String nameIn = scanner.nextLine();

            for (int j = 0; j < javaOnlineSchool.length; j++) {
                System.out.println(javaOnlineSchool[j].getId() + " " + javaOnlineSchool[j].getName());
                ;
            }
            System.out.println("Input id course: ");
            int courseIn = Integer.parseInt(scanner.nextLine());
            System.out.println("Input teacher or student: ");
            String roleIn = scanner.nextLine();

            personList[i] = new Person(nameIn, courseIn, roleIn);
        }
        System.out.println();
        System.out.println("Crated persons: ");
        for (int i = 0; i < personList.length; i++) {
            System.out.println(personList[i]);

        }
        System.out.println("-------------------------");
        System.out.println("Lection: ");
        Lecture lecture = new Lecture("Java Basices", 1);
        lecture.info();
    }


    public static void showLector(int personID) {
        for (int i = 0; i < personList.length; i++) {
            if (personID == personList[i].getId()) {
                personList[i].info();
                return;
            }
        }
    }
}


