package Collections.ArrayList;
/*

 */

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_T {
    public static void main(String[] args) {
        ArrayList<String>songList = new ArrayList<String>();
        songList.add("Килограмм");
        songList.add("Сектор газа");
        songList.add("Лаэртский");
        songList.add("Ногано");
        songList.add("Ян Арлазоров");
        //songList.add("Добовил строку 1.0");
        songList.add(3,"добавил строку по индексу");// добавление по индексу со сдвигом остальных вправо

        //for(String s : songList) {
         //   System.out.println(s);
       // }
        ArrayList<String>secondList = new ArrayList<String>();
        secondList.add("Алла Пугачева");
        secondList.add("Филипп Киркоров");
        secondList.addAll(1,songList);
        System.out.println("перемешали обе коллекции");
        for (String s : secondList){
            System.out.println(s);
        }

        System.out.println("проверяем наличие объекта сектор газа");
        System.out.println(secondList.contains("Сектор газа"));
        System.out.println(secondList.contains("Дима Билан"));
        boolean r =  secondList.contains("Укупник");

        if(r = true){
            System.out.println("я такую хуйню не слушаю");
        }
        Collections.sort(secondList);
        System.out.println("отсортированная коллекция");
        for(String s : secondList){
            System.out.println(s);
        }
    }
}
