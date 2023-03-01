package babii.hw3;

public class Lecture {
    private static int numLec = 0;

    private int id;
    private String topic;

    public Lecture(String topic) {
        numLec++;
        this.id = numLec;
        this.topic = topic;
    }

    public static int getNumLec() {
        return numLec;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }


    @Override
    public String toString() {
        return "Lecture{" +
                "id=" + id +
                ", topic='" + topic + '\'' +
                '}';
    }
//        System.out.println("Study lecture:");
//
//        System.out.println("Number of Teachers " + teacher);
//        System.out.println("Number of students " + student);



}
