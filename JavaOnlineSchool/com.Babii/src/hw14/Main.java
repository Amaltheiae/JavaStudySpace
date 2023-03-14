package hw14;

import entities.Homework;
import entities.Lecture;

public class Main {
    public static void main(String[] args) {

        Lecture lect1 = new Lecture("Inharitance", 5);

        Homework hw1 = new Homework(1, lect1.getId(), "creat cod for demo Override");
        Homework hw2 = new Homework(2, lect1.getId(), "creat cod for demo Overload");
        System.out.println(hw1);
        System.out.println(hw2);

        lect1.addHomework(hw1);
        lect1.addHomework(0, hw2);

        lect1.info();
    }
}
