package main;

//Ввести строки из файла, записать в список ArrayList. Выполнить сортировку строк, используя метод sort() из класса Collections

import java.io.FileReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FileReader fileReader = new FileReader( "file.txt" );
        Scanner scan = new Scanner(fileReader);
        ArrayList<String> sourceLines = new ArrayList<String>();
        StringLengthSort stringLengthSort = new StringLengthSort();
        while (scan.hasNextLine()) {
            sourceLines.add(scan.nextLine());
        }

        sourceLines.sort(stringLengthSort);

        for(String str : sourceLines) {
            System.out.println(str);
        }

        fileReader.close();
    }
}
