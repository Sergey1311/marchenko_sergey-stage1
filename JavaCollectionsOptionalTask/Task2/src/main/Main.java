package main;

//Ввести число, занести его цифры в стек. Вывести число, у которого цифры идут в обратном порядке.

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");

        int number = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();
        while (number > 0) {
            System.out.print(stack.push(number % 10));
            number /= 10;
        }
    }
}
