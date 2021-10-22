package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Sort {
    public static void main(String[] args) {
        ArrayList<Artist>artistArrayList = new ArrayList<Artist>();
        Artist artist1 = new Artist("Олег", "Янковский");
        Artist artist2 = new Artist("Михаил", "Задорнов");
        Artist artist3 = new Artist("Александр","Абдулов");
        Artist artist4 = new Artist("Максим","Аверин");
        Artist artist5 = new Artist("Михаил", "Жванецкий");


        artistArrayList.add(artist1);
        artistArrayList.add(artist2);
        artistArrayList.add(artist3);
        artistArrayList.add(artist4);
        artistArrayList.add(artist5);

        for (Artist c : artistArrayList){
            System.out.println(c);
        }
        Collections.sort(artistArrayList);
        System.out.println("сортируем");
        for (Artist s : artistArrayList){
            System.out.println(s);
        }
    }
}
