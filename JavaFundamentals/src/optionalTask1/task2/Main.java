package optionalTask1.task2;

// Вывести числа в порядке возрастания (убывания) значений их длины.

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
        String[] numberString = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Число %d:", i + 1);
            while (!sc.hasNextInt()) {
                System.out.println("Введите число!");
                sc.next();
            }
            numbers[i] = sc.nextInt();
            numberString[i] = Integer.toString(numbers[i]);
        }

        String tempLength;
        for (int i = 1; i < numbers.length; i++) {
            for (int j = numbers.length - 1; j >= i; j--) {
                if (numberString[j - 1].length() > numberString[j].length()) {
                    tempLength = numberString[j - 1];
                    numberString[j - 1] = numberString[j];
                    numberString[j] = tempLength;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numberString[i] + " ");
        }
    }
}
