package optionalTask1.task4;

// Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество чисел:");

        int size = sc.nextInt();
        if(size < 1){
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
        int min = countNumber(numbers[0]);
        int minElement = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (countNumber(numbers[i]) < min) {
                min = countNumber(numbers[i]);
                minElement = numbers[i];
            }
        }
        System.out.println("Число " + minElement + " имеет наименьшее количество разных цифр - " + min);
    }
private static int countNumber(int num) {
    HashSet<Integer> nums = new HashSet<>();
    while (num > 0) {
        nums.add(num % 10);
        num /= 10;
    }
    return nums.size();
    }
}

