package hw14;

import entities.Lecture;

public interface LecturesInterface {
    Lecture[] getAll();
    void add(Lecture lecture);
    Lecture getById (int index);
    void deleteById(int index);
}
