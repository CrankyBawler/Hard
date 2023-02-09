public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("1.4 Циклы. Повышенная сложность Задача 4");
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println( i + ": ping pong");}
            if (i % 5 != 0 && i % 3 == 0 ) {
                System.out.println(i + ": ping");
                }
            if (i % 5 == 0 && i % 3  != 0){
                System.out.println(i + ": pong");
            }
            if (i % 5 != 0 && i % 3 !=0){
                System.out.println(i + ":");
            }
        }
    }
    public static void task2() {
        System.out.println("1.4 Циклы. Повышенная сложность Задача 5");
        int a = 0;
        int b = 1;
        for (int i = 1; i <= 5; i++){
            System.out.print(a + " " + b + " ");
            a = a + b;
            b = a +b;
        }
        }
}
