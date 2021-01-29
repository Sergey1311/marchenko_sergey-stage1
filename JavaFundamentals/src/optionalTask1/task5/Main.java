package optionalTask1.task5;

//Найти количество чисел, содержащих только четные цифры, а среди оставшихся — количество чисел с равным числом четных
// и нечетных цифр.

import java.util.ArrayList;
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
        Integer[] numbersLengths = new Integer[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Число %d:", i + 1);
            while (!sc.hasNextInt()) {
                System.out.println("Введите число!");
                sc.next();
            }
            numbers[i] = sc.nextInt();
            numbersLengths[i] = String.valueOf(numbers[i]).length();
        }
        int countEven = 0;
        int countEvenOdd = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(even(numbers[i]) == numbersLengths[i])
            {
                countEven++;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if((even(numbers[i]) == numbersLengths[i] / 2) && (numbersLengths[i] % 2 < 1))
            {
                countEvenOdd++;
            }
        }
        System.out.println("Количество чисел, содержащих только четные цифры, равно - " + countEven);
        System.out.println("Количество чисел, содержащих равное число четных и нечетных цифры, равно - " + countEvenOdd);
    }
    private static int even(int num) {
        ArrayList<Integer> listEven = new ArrayList<>();
        while (num > 0) {
            if (num % 2 < 1){
            listEven.add(1);
            }
            num /= 10;
        }
        return listEven.size();
    }
}
