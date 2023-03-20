package entities;

import hw11.MainHw11;
import hw13.MyGeneric;

public class Lecture {
    private static int countLecture;
    private int id;
    private String topic;
    private int personID;
    private MyGeneric<Homework> tasks;

    public Lecture(String name, int personID) {
        id = ++countLecture;
        this.id = id;
        this.topic = name;
        this.personID = personID;
        this.tasks = new MyGeneric<>(1);
    }

    public int getId() {
        return id;
    }

    public String getTopic() {
        return topic;
    }

    public int getPersonID() {
        return personID;
    }

    public void addHomework (Homework hw){
        tasks.add(hw);
    }

    public void addHomework (int index, Homework hw){
        tasks.add(index, hw);
    }

    public void setHomeworks (Homework [] hwList){
        tasks = new MyGeneric<>(hwList);
    }

    public void showHw(){
        System.out.println("homeworks for lections");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(tasks.get(i).toString());

        }
    }

    public void info(){
        System.out.println(topic);
       //MainHw11.showLector(personID);
        showHw();
    }
}
