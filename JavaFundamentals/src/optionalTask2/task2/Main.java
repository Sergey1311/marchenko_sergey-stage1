package optionalTask2.task2;

//Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд.

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

        int count = 1;
        int res = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 1; j < size; j++) {
                if (matrix[i][j - 1] < matrix[i][j]) {
                    count++;
                } else {
                    if (matrix[i][j - 1] >= matrix[i][j] && count > res) {
                        res = count;
                    }
                    count = 1;
                }
            }
        }
        System.out.println("Наибольшее число возрастающих элементов матрицы, идущих подряд: " + res);

        for (int i = 0; i < size; i++) {
            for (int j = 1; j < size; j++) {
                if (matrix[i][j - 1] > matrix[i][j]) {
                    count++;
                } else {
                    if (matrix[i][j - 1] <= matrix[i][j] && count > res) {
                        res = count;
                    }
                    count = 1;
                }
            }
        }
        System.out.println("Наибольшее число убывающих элементов матрицы, идущих подряд: " + res);
    }
}