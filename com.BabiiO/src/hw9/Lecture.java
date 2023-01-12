package hw9;
import java.util.Arrays;

public class Lecture {

    private final Marks[] marks = new Marks[]{new Marks(99), new Marks(82), new Marks(91),
            new Marks(76), new Marks(100), new Marks(95)};

    public void showLecture() {
        System.out.println(Arrays.toString(marks));
        System.out.println(marks[2]);
        System.out.println(marks.length);

    }
}










