package optionalTask1.task6;

// Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество чисел:");

        int size = sc.nextInt();
        if (size < 1) {
            System.out.println("Неверное количество");
            return;
        }
        Integer[] numbers = new Integer[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Число %d:", i + 1);
            while (!sc.hasNextInt()) {
                System.out.println("Введите число!");
                sc.next();
            }
            numbers[i] = sc.nextInt();
        }

        int order = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            int num = numbers[i];
            int remain = 10;
            while (num > 0) {
                if ((num % 10) < remain) {
                    remain = num % 10;
                    num /= 10;
                    if (num == 0) {
                        order = numbers[i];
                        break;
                    }
                } else break;
            }
        }
        if(order == 0) {
            System.out.println("Таких чисел нет");
        } else {
            System.out.println("Число, цифры в котором идут в строгом порядке возрастания: " + order);
        }
    }
}
