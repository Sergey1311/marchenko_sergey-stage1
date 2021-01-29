package optionalTask2.task3;

// Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность матрицы:");

        int size = sc.nextInt();
        if (size < 1) {
            System.out.println("Неверно");
            return;
        } else {
            System.out.println("Матрица размером - " + size + "x" + size);
        }
        System.out.println("Введите диапазон значений матрицы:");

        int range = sc.nextInt();
        if (range < 1) {
            System.out.println("Неверно");
            return;
        } else {
            System.out.println("Диапазон значений матрицы - (-" + range + "; " + range + ")");
        }
        Integer[][] matrix = new Integer[size][size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(range * 2) - range;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        //       ************************************


        for (int i = 0; i < size; i++) {
            int indexFirst = 0;
            int indexSecond = 0;
            for (int j = 0; j < size; j++) {
                if (matrix[i][j] > 0) {
                    indexFirst = j;
                    break;
                }
            }
            for (int j = indexFirst + 1; j < size; j++) {
                if (matrix[i][j] > 0) {
                    indexSecond = j;
                    break;
                }
            }
            if (indexSecond == 0) {
                System.out.println("В строке " + (i + 1) + " меньше двух положительных чисел");
            } else {
                int sum = 0;
                for (int j = indexFirst + 1; j < indexSecond; j++)
                    sum += matrix[i][j];
                System.out.println("Сумма элементов строки " + (i + 1) + " : " + sum);
            }
        }
    }
}
