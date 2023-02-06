package olena.babii.hw3.onlineschool;

import java.util.Arrays;

public class Course {

    private int idCourse;
    private String nameCourse;
    private Lecture[] lectures;


    public Course(int idCourse, String nameCourse, Lecture[] lectures) {
        this.idCourse = idCourse;
        this.nameCourse = nameCourse;
        this.lectures = lectures;
    }

    public Lecture[] getLectures() {
        return lectures;
    }

    @Override
    public String toString() {
        return "Course{" +
                "idCourse=" + idCourse +
                ", nameCourse='" + nameCourse + '\'' +
                ", lectures=" + Arrays.toString(lectures) +
                '}';
    }

    public void getAllLections(){
        for (int i = 0; i < lectures.length; i++){
            System.out.println(lectures[i]);
        }
    }

}