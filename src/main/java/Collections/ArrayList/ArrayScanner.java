package Collections.ArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayScanner {
    public static void main(String[] args) throws IOException {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);

        //создаем список строк
        ArrayList<String> list = new ArrayList<String>();

        // добавляем в список элементы с клавиатуры, с конца
        for (int i=0; i<5; i++)
        {
            String s = reader.readLine();
            list.add(0, s);
        }

        // Используя цикл выводим содержимое на экран

        for (int i=0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}
