import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("1.4 Циклы. Повышенная сложность Задача 4");
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ": ping pong");
            }
            if (i % 5 != 0 && i % 3 == 0) {
                System.out.println(i + ": ping");
            }
            if (i % 5 == 0 && i % 3 != 0) {
                System.out.println(i + ": pong");
            }
            if (i % 5 != 0 && i % 3 != 0) {
                System.out.println(i + ":");
            }
        }
    }

    public static void task2() {
        System.out.println("1.4 Циклы. Повышенная сложность Задача 5");
        int a = 0;
        int b = 1;
        for (int i = 1; i <= 5; i++) {
            System.out.print(a + " " + b + " ");
            a = a + b;
            b = a + b;
        }
    }

    public static void task3() {
        System.out.println("1.5 - 1.6 Массивы. Повышенная сложность Задача 5");
        int[][] array = new int[3][3];
        array[0][0] = array[1][1] = array[2][2] = array[0][2] = array[2][0] = 1;
        for (int[] row : array) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }


    public static void task4() {
        System.out.println("1.5 - 1.6 Массивы. Повышенная сложность Задача 6");
        int[] arr1 = {5, 4, 3, 2, 1};
        int[] arr = new int[5];
        System.out.println(Arrays.toString(arr1));
        int i = 0;
        int a = arr.length -1;
        while (i < arr1.length && a >= 0){
            arr [i] = arr1[a];
        i = i +1;
        a = a -1;
                }
        System.out.println(Arrays.toString(arr));
    }
}
