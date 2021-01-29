package main;

//Ввести строки из файла, записать в список. Вывести строки в файл в обратном порядке

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        FileReader fileReader = new FileReader( "file.txt" );
        Scanner scan = new Scanner(fileReader);
        List<String> sourceLines = new ArrayList<>();
        List<String> targetLines = new ArrayList<>();

        while (scan.hasNextLine()) {
            sourceLines.add(scan.nextLine());
        }

        for (String str : sourceLines) {
            System.out.println(str);
        }

        System.out.println("\nReverse:");

        for (int i = sourceLines.size() - 1; i >= 0; i--) {
            targetLines.add(sourceLines.get(i));
        }

        FileWriter newFile = new FileWriter("newfile.txt");
        for(String str : targetLines) {
            System.out.println(str);
            newFile.write(str + '\n');
        }

       fileReader.close();
       newFile.close();
    }
}
