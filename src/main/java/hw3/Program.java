package hw3;

public class Program {
    public static void main(String[] args) {

        System.out.println(Calculator.divide(54.34, 13.345));
        System.out.println(Calculator.sum((short) 5, 187L));
        System.out.println(Calculator.multiply((byte) 3, 7.4f));
        System.out.println(Calculator.subtraction((long) 23, (short) 15));

        Byte[] arr1 = {10, 0b10, 30, 40, 0};
        Byte[] arr2 = {10, 20, 30, 40, 50};
        Long[] arr3 = {1L, 2L, 3L, 4L, 5L};
        Long[] arr4 = {1L, 2L, 3L, 4L, 6L};
        System.out.println(Calculator.compareArrays(arr1, arr2));
        System.out.println(Calculator.compareArrays(arr3, arr4));
        System.out.println(new Pair<>("Hello", 123).toString());



    }
}
