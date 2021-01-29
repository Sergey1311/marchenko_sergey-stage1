package mainTask.task5Array;

//Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу.
//Осуществить проверку корректности ввода чисел.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] months = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер месяца:");
        int i = sc.nextInt();
        if (i > 0 && i < 13) {
            System.out.println(months[i - 1]);
        } else {
            System.out.println("Неверный номер месяца");
        }
    }
}
