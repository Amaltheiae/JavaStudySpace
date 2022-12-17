package homework_3;

import homework_3.Online_school.FirstYearStudy;
import homework_3.Online_school.SecondYearStudy;
import homework_3.Online_school.ThirdYearStudy;

public class Main {


    public static void main(String[] args) {

        FirstYearStudy firstYearStudy = new FirstYearStudy();

        SecondYearStudy secondYearStudy = new SecondYearStudy();

        ThirdYearStudy thirdYearStudy = new ThirdYearStudy();

        System.out.println("Third Year Study:");
        System.out.println("Name of lecture - " + thirdYearStudy.lecture);
        System.out.println("Number of Teachers " + thirdYearStudy.teacher);
        System.out.println("Number of students " + thirdYearStudy.student);
        System.out.println("Number of homework " + thirdYearStudy.student);



    }
}