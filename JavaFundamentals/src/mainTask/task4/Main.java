package mainTask.task4;

//Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int mult = 1;
        for (String arg : args) {
            int j = Integer.parseInt(arg);
            sum = sum + j;
            mult = mult * j;
        }
        System.out.println(sum);
        System.out.println(mult);
    }
}
