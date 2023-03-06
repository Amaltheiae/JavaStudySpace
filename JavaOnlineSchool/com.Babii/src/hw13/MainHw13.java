package hw13;

public class MainHw13 {
    public static void main(String[] args) {
        MyGeneric<Integer> arrInt = new MyGeneric<>(new Integer[]{1, 5, 8, 9});
        System.out.println(arrInt);
        System.out.println(arrInt.size());
        System.out.println(arrInt.isEmpty());
        System.out.println(arrInt.get(-5));
        System.out.println(arrInt.get(4));
        System.out.println(arrInt.get(5));
        System.out.println(arrInt.get(1));

        arrInt.add(25);
        arrInt.add(new Integer("33"));
        System.out.println(arrInt);
        System.out.println();

        arrInt.add(-5, 4);
        arrInt.add(100, 4);
        arrInt.add(2, 777);
        System.out.println(arrInt);

        arrInt.remove(arrInt.size() - 1);
        arrInt.remove(arrInt.size() - 1);
        arrInt.remove(0);
        System.out.println(arrInt);

        MyGeneric<Integer> arrInt2 = new MyGeneric<>(3);
        System.out.println(arrInt2);
        System.out.println(arrInt2.isEmpty());

    }
}
