package mainTask.task3;

//Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество чисел:");

        int i = sc.nextInt();
        int a, b;
        a = 0;
        while (a<i) {
            b= (int) (Math.random() * 100);
            System.out.print(b + " "); //без перехода на новую строку
            System.out.print(b + "\n");//c переходом на новую строку
            a++;
        }
    }
}
