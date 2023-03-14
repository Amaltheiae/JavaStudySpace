package hw14;

import entities.Lecture;
import hw13.MyGeneric;

public class LectureRepository implements LecturesInterface {
    MyGeneric<Lecture> list;

    public LectureRepository() {
        list = new MyGeneric<>(3);
        list.add(new Lecture("Generics", 1));
        list.add(new Lecture("Interfaces", 1));
        list.add(new Lecture("Abstract Classes", 1));
    }

    @Override
    public Lecture[] getAll() {
        Lecture[] arr = new Lecture[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    @Override
    public void add(Lecture lecture) {
        list.add(lecture);
    }

    @Override
    public Lecture getById(int index) {
        return list.get(index);
    }

    @Override
    public void deleteById(int index) {
        list.remove(index);

    }
}
