package optionalTask1.task7;

//Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.

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
        Integer[] numberLengths = new Integer[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Число %d:", i+1);
            while (!sc.hasNextInt()) {
                System.out.println("Введите число!");
                sc.next();
            }
            numbers[i] = sc.nextInt();
            numberLengths[i] = String.valueOf(numbers[i]).length();
        }

        for (int i = 0; i < size; i++) {
            if (numberLengths[i] == countDigits(numbers[i])){
                System.out.println("Число, состоящее только из различных цифр: " + numbers[i]);
                break;
            } else {
                System.out.println("Таких чисел нет");
            }
        }
    }
    private static int countDigits(int num) {
        HashSet<Integer> nums = new HashSet<>();
        while (num > 0) {
            nums.add(num % 10);
            num /= 10;
        }
        return nums.size(); 
    }
}
