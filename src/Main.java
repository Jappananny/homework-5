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
        //Задача 6
        System.out.println("Задача 6");
        for (int i6 = 7; i6 < 99; i6 = i6 + 7) {
            System.out.println("" + i6);
        }
        //Задача 7
        System.out.println("Задача 7");
        for (int i7 = 1; i7 < 513; i7 = i7 * 2) {
            System.out.println("" + i7);
        }
        //Задача 8
        System.out.println("Задача 8");
        int moneyForEat = 29000;
        int total = 0;
        for (int i8 = 0; i8 < 12; i8++) {
            total = total + moneyForEat;
            System.out.println("Месяц " + i8 + " , сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Итого "+total);
    }
}