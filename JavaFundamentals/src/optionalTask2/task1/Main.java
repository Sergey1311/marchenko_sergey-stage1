package optionalTask2.task1;

//Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки)

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
        System.out.println("Введите номер столбца: ");
        int k = sc.nextInt();
        k--;
        if (k >= size || k < 0) {
            System.out.println("Неверно");
            return;
        }
            for (int i = 1; i < size; i++) {
                    if (matrix[i-1][k] > matrix[i][k]) {
                        for (int j = 0; j < size; j++) {
                            int temp = matrix[i-1][j];
                            matrix[i-1][j] = matrix[i][j];
                            matrix[i][j] = temp;
                        }
                    }
            }
        System.out.println("Результат:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

