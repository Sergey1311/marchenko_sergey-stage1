package optionalTask1.task3;

//Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.

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

        int sum = 0;
        for (int i = 0; i < size; i++){
            sum = sum + numberLengths[i];
        }
        double midSum = (double) sum/size;
        System.out.println("Числа, длина которых меньше средней длины по всем числам");
        for (int i = 0; i < size; i++){
            if (numberLengths[i] < midSum){
                System.out.println("Число: " + numbers[i] + ", его длина " + numberLengths[i]);
            }
        }
        System.out.println("Числа, длина которых больше средней длины по всем числам");
        for (int i = 0; i < size; i++) {
            if (numberLengths[i] > midSum) {
                System.out.println("Число: " + numbers[i] + ", его длина " + numberLengths[i]);
            }
        }
    }
}
