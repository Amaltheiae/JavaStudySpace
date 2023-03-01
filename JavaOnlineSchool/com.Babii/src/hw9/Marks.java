package hw9;

public class Marks {
    int marks;

    public Marks(final int marks) {
        this.marks = marks;
    }

    public Marks() {
    }


    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }


    @Override
    public String toString() {
        return "{" +
                "Students marks = " + marks +
                '}';
    }
}
