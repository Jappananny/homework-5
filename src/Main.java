public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        for (int i = 1; i < 11; i++) {
            System.out.println("Котиков у бабы Гали стало " + i);
        }
        //Задача 2
        System.out.println("Задача 2");
        for (int i2 = 10; i2 > 0; i2--) {
            System.out.println("Котиков у бабы Гали стало " + i2);
        }
        //Задача 3
        System.out.println("Задача 3");
        for (int i3 = 0; i3 < 17; i3 += 2) {
            System.out.println("Котиков у бабы Гали стало " + i3);
        }
        //Задача 4
        System.out.println("Задача 4");
        for (int i4 = 10; i4 > -11; i4--) {
            System.out.println("Котиков у бабы Гали стало " + i4);
        }
        //Задача 5
        System.out.println("Задача 5");
        for (int i5 = 1904; i5 < 2097; i5 = i5 + 4) {
            System.out.println(i5 + " год является високосным");
        }
    }
}