package hw8;

import java.util.Random;


public class Main {
    public static void main(String[] args) {
        System.out.println("program will be terminated when values are 2, 3, or 7");

        int i;
        Random number = new Random();

//        while(true) {
//            i = number.nextInt(20);
//            System.out.println("number is - " + i);
//
//            if (i == 2||i == 3||i == 7){
//                System.out.println("Value is " + i + " your program will be terminated now");
//                System.exit(i);
//            }
//        }
        int j = 0;
        while (j < 8){
            j++;
            System.out.println("New lecture is - " + j);
        }

    }
}
