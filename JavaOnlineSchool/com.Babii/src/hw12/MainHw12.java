package hw12;

import entities.Person;

import java.util.Scanner;

public class MainHw12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input firstname: ");
        String firstname = scanner.nextLine();

        System.out.println("Please input lastname: ");
        String lastname = scanner.nextLine();

        System.out.println("Please input phone: ");
        String phone = scanner.nextLine();

        System.out.println("Please input email: ");
        String email = scanner.nextLine();

        if (!entities.Person.isNameCorect(firstname)) {
            System.out.println("firstname is not corect");
        } else {
            if (!entities.Person.isNameCorect(lastname)) {
                System.out.println("lastname is not corect");
            } else {
                Person myPerson = new Person(firstname, lastname, phone, email);
                System.out.println(myPerson);
            }

        }
    }
}
