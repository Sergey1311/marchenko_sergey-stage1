package optionalTask1.task1;

//Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.

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
        int max = numberLengths[0];
        int countMax = numbers[0];
        for (int i = 0; i < size; i++){
            if (max < numberLengths[i]){
                max = numberLengths[i];
                countMax = numbers[i];
            }
        }
        System.out.println("Самое длинное число: " + countMax + ", его длина: " + max);

        int min = numberLengths[0];
        int countMin = numbers[0];
        for (int i = 0; i < size; i++){
            if (min > numberLengths[i]){
                min = numberLengths[i];
                countMin = numbers[i];
            }
        }
        System.out.println("Самое короткое число: " + countMin + ", его длина: " + min);
    }
}
