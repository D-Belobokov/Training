package Collections.ArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

public class HashMap_Scanner {
    public static void main(String[] args) throws IOException {
        Reader r = new InputStreamReader(System.in);
        BufferedReader readerKey = new BufferedReader(r);

        Reader t = new InputStreamReader(System.in);
        BufferedReader readerString = new BufferedReader(t);

        Map<String, Reader> city = new HashMap<>();
        for (int i=0; i<5; i++)
        {
            String s = readerKey.readLine();
            String s1 = readerString.readLine();
            city.put(s,t);
        }


       /* for (int i=0; i<5; i++)
        {
            String h = readerKey.readLine();
            city.put(readerKey,h);
        }
*/
        System.out.println(city.toString());

       // city.put("Суббота",null);
        //city.put(" ","терминатор");



    }
}
