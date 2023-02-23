import java.util.Arrays;

public class Main {
    public static int[] arr(int[] a) {
        for (int i = a.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(a[i] + ", ");
            } else {
                System.out.print(a[i]);
            }
        }
        return a;
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
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
        System.out.println("");
    }

    public static void task3() {
        System.out.println("1.5 - 1.6 Массивы. Повышенная сложность Задача 5");
        int[][] array2D = new int[3][3];
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    array2D[i][j] = 1;
                } else {
                    array2D[i][j] = 0;
                }
                System.out.print(array2D[i][j] + " ");
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
        int a = arr.length - 1;
        while (i < arr1.length && a >= 0) {
            arr[i] = arr1[a];
            i = i + 1;
            a = a - 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void task5() {
        System.out.println("1.5 - 1.6 Массивы. Повышенная сложность Задача 7");
        int[] arr = {5, 4, 3, 2, 1};
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arr[i]);
            } else {
                System.out.print(+arr[i] + ", ");
            }
        }
    }

    public static void task6() {
        System.out.println("1.5 - 1.6 Массивы. Очень сложно. Задание 8");
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[i] + arr[j] == -2) {
                    System.out.println(arr[i] + " , " + arr[j]);
                }
            }
    }

    public static void task7() {
        System.out.println("1.5 - 1.6 Массивы. Очень сложно. Задание 9");
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[i] + arr[j] == -2) {
                    System.out.println(arr[i] + " , " + arr[j]);
                }
            }
    }

    public static void task8() {
        System.out.println("1.7 Строки. Повышенная сложность. Задание 5");
        String fullName = "Ivanov Ivan Ivanovich";
        int index1 = fullName.indexOf(' ');
        int index2 = fullName.lastIndexOf(' ');
        String lastName = fullName.substring(0, index1);
        String firstName = fullName.substring(index1, index2);
        String middleName = fullName.substring(index2, fullName.length());
        System.out.println("Имя сотрудника" + firstName);
        System.out.println("Фамилия сотрудника " + lastName);
        System.out.println("Отчество сотрудника" + middleName);
    }

    public static void task9() {
        System.out.println("1.7 Строки. Повышенная сложность. Задание 6");
        String fullName = "ivanov ivan ivanovich";


    }

    public static void task10() {
        System.out.println("1.7 Строки. Повышенная сложность. Задание 7");

    }

    public static void task11() {
        System.out.println("1.7 Строки. Повышенная сложность. Задание 8");

    }

    public static void task12() {
        System.out.println("1.8 Методы. Повышенный уровень. Задание 4");
        int[] array = {3, 2, 1, 6, 5};
        arr(array);
    }
}





























