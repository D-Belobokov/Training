package Collections.ArrayList;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Artist implements  Comparable<Artist>{
    String name;
    String lastName;


    public Artist(String name,String lastName){
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public int compareTo(Artist o) {
        return name.compareTo(o.getLastName());
    }

    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
