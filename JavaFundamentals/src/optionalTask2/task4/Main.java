package optionalTask2.task4;

//Найти максимальный элемент в матрице и удалить из матрицы все строки и столбцы, его содержащие

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
        Integer[][] matrixNew = new Integer[size - 1][size - 1];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(range * 2) - range;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        //       ************************************

        int max = -range;
        int iMax = 0;
        int jMax = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++){
                if (matrix[i][j] > max){
                    jMax = j;
                    iMax = i;
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("Максимальный элемент - " + max + " (" + (iMax + 1) + " строка " + (jMax + 1) + " столбец)" );

        int iNew = 0;
        int jNew = 0;

        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if(i != iMax) {
                    if(j != jMax) {
                        matrixNew[iNew][jNew] = matrix[i][j];
                        jNew++;
                    }
                }
                else {
                    iNew--;
                    break;
                }
            }
            iNew++;
            jNew = 0;
        }
        System.out.println("Новая матрица:");
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1; j++) {
                System.out.print(matrixNew[i][j] + " ");
            }
            System.out.println();
        }
    }
}
