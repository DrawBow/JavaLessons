/*
        Программа должна считывать c консоли имя файла.
        Программа должна выводить на экран содержимое файла.
        Поток чтения из файла (FileInputStream) должен быть закрыт.
        BufferedReader также должен быть закрыт.
*/

import java.awt.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

// Интерфейсы
public class Chapter7_2_FileRead {
    public static void main(String[] args) {
        String fileName = readFileName();
        String fileBody = readFile(fileName);
        System.out.println(fileBody);
    }

    // читаем файл в строку с помощью класса Files
    private static String readUsingFiles(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

    private static String readFile(String fileName) {
        String result = null;
        FileInputStream fileInputStream;
        File file = new File(fileName);
         try {
              fileInputStream = new FileInputStream(file);
              result = new String(fileInputStream.readAllBytes());
              fileInputStream.close();
         } catch (IOException e) {
              System.out.println("Файл не найден ");
         }
         return result;
    }

    public static String readFileName() {
        String result = null;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            result = bufferedReader.readLine();
        }
        catch (IOException e) {
           System.out.println("Ошибка ввода");
        }
        return result;
    }

}
/*
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inStream = new FileInputStream(reader.readLine());
        reader.close();
        while (inStream.available() > 0) {
            System.out.print((char)inStream.read());
        }
        inStream.close();
    }
}
*/