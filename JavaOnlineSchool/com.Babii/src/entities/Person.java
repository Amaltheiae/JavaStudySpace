package entities;

import hw11.MainHw11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {
    public static int countPerson;
    private int id;
    private int courseId;
    private String name;
    private Role role;

    private String firstname;
    private String lastname;
    private String phone;
    private String email;

    public Person() {
    }

    public Person(String name, int courseId, String role) {
        id = ++countPerson;
        this.name = name;
        this.courseId = courseId;
        this.role = Role.valueOf(role.toUpperCase());
    }

    public Person(String firstname, String lastname, String phone, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.email = email;
    }
    public static boolean isNameCorect(String name){
        final String REGEX_NAME = "^[A-Z][a-z]+$";
        return checkRegex(REGEX_NAME, name);
    }

    private static boolean checkRegex(String regex, String string) {
        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(string);
        return matcher.find();
    }
    public boolean isPhoneCorect(String phone){
        final String REGEX_NAME = "^\\+38\\(0\\d\\d\\)\\d{7}$";
        return checkRegex(REGEX_NAME, phone);
    }


    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", courseId=" + courseId +
                ", name='" + name + '\'' +
                ", role=" + role +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public void info(){
        System.out.println(role);
        System.out.println(name);
        MainHw11.showById(courseId);
    }
}
