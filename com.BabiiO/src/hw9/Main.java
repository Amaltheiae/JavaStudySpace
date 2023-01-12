package hw9;


public class Main {
    public static void main(String[] args) {

        Lecture lecture = new Lecture();
        lecture.showLecture();
        Lecture lecture1 = new Lecture();
        Lecture lecture2 = new Lecture();



        int[] values = new int[10];
        fillArray(values);
        printArray(values);
    }

    public static void printArray(int[] values) {
        System.out.println();
        for (int i = 0; i < values.length; i++)

            System.out.print(values[i] + " ");

        System.out.println();
    }

    public static void fillArray(int[] values) {
        int currentIndex = 0;
        for (int currentValue = 0; currentIndex < values.length; currentValue *= 3, currentValue++) {
            if (currentValue % 2 == 0) {
                values[currentIndex] = currentValue + 1;
                currentIndex++;
            }

        }

    }


}









