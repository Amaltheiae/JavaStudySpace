package babii.entities;

import babii.hw11.MainHw11;

public class Lecture {
    private static int countLecture;
    private int id;
    private String topic;
    private int personID;

    public Lecture(String name, int personID) {
        id = ++countLecture;
        this.id = id;
        this.topic = name;
        this.personID = personID;
    }
    public void info(){
        System.out.println(topic);
        MainHw11.showLector(personID);
    }
}
