package mainTask.task1;

//Приветствовать любого пользователя при вводе его имени через командную строку

public class Main {
    public static void main(String[] args) {
        for (String str : args) {
            System.out.println("Здравствуйте, " + str + "!");
        }
    }
}
